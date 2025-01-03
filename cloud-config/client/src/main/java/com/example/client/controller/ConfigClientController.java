package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${example.property}")
    private String exampleProperty;

    @GetMapping("/config")
    public String getConfigProperty() {
        return exampleProperty;
    }
}
