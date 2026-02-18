package com.Sanketh.WeatherApp.Controller;

import org.springframework.ui.Model;
import com.Sanketh.WeatherApp.Entity.WeatherResponse;
import com.Sanketh.WeatherApp.Service.WetherService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class frontendController {
    private final WetherService wetherService;

    public frontendController(WetherService wetherService) {
        this.wetherService = wetherService;
    }


    @GetMapping("/")
    public String index() {
        return "index";
    }
    @PostMapping("/getwether")
    public  String getWether(@RequestParam String city,Model model) {
       WeatherResponse weatherResponse=  wetherService.getWeather(city);
        WeatherResponse response = wetherService.getWeather(city);
        model.addAttribute("weather", response);
        model.addAttribute("city", city);
        return "index";

    }

}
