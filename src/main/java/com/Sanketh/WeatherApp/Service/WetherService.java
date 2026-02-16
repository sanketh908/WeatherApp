package com.Sanketh.WeatherApp.Service;

import com.Sanketh.WeatherApp.Entity.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class WetherService {
    RestTemplate restTemplate = new RestTemplate();
    @Value("${openmeteo.geocode.url}")
    private String geocodeUrl;

    @Value("${openmeteo.weather.url}")
    private String weatherUrl;

    public WeatherResponse getCity(String city){
        String Replace = geocodeUrl.replace("{city}", city);
        ResponseEntity<WeatherResponse> response= restTemplate.exchange(Replace, HttpMethod.GET,null, WeatherResponse.class);
        WeatherResponse weatherResponse = response.getBody();
        return weatherResponse ;
    }
    public ResponseEntity<WeatherResponse> getWeather(String city){
        String Replace = weatherUrl.replace("{city}", city);
    }
}
