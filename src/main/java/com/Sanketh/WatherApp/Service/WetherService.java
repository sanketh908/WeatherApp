package com.Sanketh.WatherApp.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class WetherService {
    RestTemplate restTemplate = new RestTemplate();
    @Value("${openmeteo.geocode.url}")
    private String geocodeUrl;

    @Value("${openmeteo.weather.url}")
    private String weatherUrl;

    public String getCity(String city){

    }
}
