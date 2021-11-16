package com.example.UrlShortener.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ngsmirnov
 */
@RestController
public class Hello {

    @RequestMapping("/")
    String sayHello() {
        return "hello";
    }
}
