package com.Sanketh.WeatherApp.Controller;

import com.Sanketh.WeatherApp.Entity.WeatherResponse;
import com.Sanketh.WeatherApp.Service.WetherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wether")
public class WetherController {
 private  WetherService wetherService;
 @GetMapping("/todayweather/{city}")
 public ResponseEntity<WeatherResponse> getTodayWeather(@PathVariable String city ){
  WeatherResponse weatherResponse = wetherService.getWeather(city);
  return new ResponseEntity<>(weatherResponse, HttpStatus.OK);



 }




}
