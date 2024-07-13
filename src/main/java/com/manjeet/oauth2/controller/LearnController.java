package com.manjeet.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LearnController {

    @GetMapping("/hello")
    public String hello() {
        return "index";
    }

/*    @GetMapping("/hello")
    public ResponseEntity<HelloResponse> hello() {
        return ResponseEntity.ok(new HelloResponse("Hello from Manjeet"));
    }*/
}
