package com.lti.response;

import lombok.Data;

@Data
public class Response {

    private String temperature;
    private String message;

    public Response(String temperature, String message) {
        this.temperature = temperature;
        this.message = message;
    }

    public Response(String temperature) {
        this.temperature = temperature;
    }
}
