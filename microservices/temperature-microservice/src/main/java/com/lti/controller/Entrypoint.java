package com.lti.controller;

import com.lti.response.Response;
import com.lti.service.TemperatureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/temperatures")
public class Entrypoint {

    private final TemperatureService temperatureService;

    public Entrypoint(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @GetMapping
    public ResponseEntity<Response> getTemperature() {
        return ResponseEntity.ok(new Response(temperatureService.fetchTemperature()));
    }
}
