package com.manjeet.oauth2.model;

import lombok.Data;

@Data
public class HelloResponse {
    public HelloResponse(String message) {
        this.message = message;
    }

    private String message;
}
