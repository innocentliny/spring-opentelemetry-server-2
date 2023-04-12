package com.example.spring.opentelemetry.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController
{
    @PostMapping(path = {"s2_api"}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(code = HttpStatus.OK)
    public void api(@RequestBody String body)
    {
        System.out.println("s2_api body: " + body);
    }
}
