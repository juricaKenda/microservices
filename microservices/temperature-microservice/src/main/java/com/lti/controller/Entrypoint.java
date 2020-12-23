package com.lti.controller;

import com.lti.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/temperatures")
public class Entrypoint {


    @GetMapping
    public ResponseEntity<Response> getTemperature() {

    }
}
