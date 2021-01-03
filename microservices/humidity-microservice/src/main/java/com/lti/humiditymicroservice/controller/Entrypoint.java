package com.lti.humiditymicroservice.controller;

import com.lti.humiditymicroservice.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/humidity")
public class Entrypoint {

    @GetMapping
    public ResponseEntity<Response> getHumidity() {
        return null;
    }
}
