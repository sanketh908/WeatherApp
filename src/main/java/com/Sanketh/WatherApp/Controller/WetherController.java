package com.Sanketh.WatherApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/wether")
public class WetherController {

    @GetMapping("/getwether")
   public String getWether(@ResponseBody ){

    }
}
