package com.Sanketh.WeatherApp.Service;

import com.Sanketh.WeatherApp.Entity.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WetherService {
    RestTemplate restTemplate = new RestTemplate();
    @Value("${weatherstack.api.key}")
    private String APIKEY;

    @Value("${weatherstack.api.url}")
    private String url;

    public WeatherResponse getWeather(String city){
        String Replace =url.replace("<city>", city).replace("<apikey>",APIKEY);
        ResponseEntity<WeatherResponse> response= restTemplate.exchange(Replace, HttpMethod.GET,null, WeatherResponse.class);
        System.out.println(response);
        WeatherResponse weatherResponse = response.getBody();
        return weatherResponse ;
    }

}
