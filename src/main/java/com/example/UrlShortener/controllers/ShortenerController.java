package com.example.UrlShortener.controllers;

import com.example.UrlShortener.json.ShortenRequest;
import com.example.UrlShortener.json.ShortenResponse;
import com.example.UrlShortener.service.ShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ngsmirnov
 */
@RestController
public class ShortenerController {

    @Autowired
    private ShortenerService service;

    @RequestMapping("shorturl")
    ShortenResponse shorten(@RequestBody ShortenRequest request) {
        String shortUrl = service.shorten(request.getLongUrl());
        return new ShortenResponse(shortUrl);
    }
}
