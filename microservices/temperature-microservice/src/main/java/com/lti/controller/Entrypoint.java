package com.lti.controller;

import com.lti.response.Response;
import com.lti.service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/temperatures")
public class Entrypoint {

    private final Service service;

    public Entrypoint(Service service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Response> getTemperature() {
        return ResponseEntity.ok(new Response(service.fetchTemperature()));
    }
}
