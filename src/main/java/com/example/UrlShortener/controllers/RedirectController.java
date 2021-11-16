package com.example.UrlShortener.controllers;

import javax.servlet.http.HttpServletResponse;

import com.example.UrlShortener.service.ShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ngsmirnov
 */
@Controller
public class RedirectController {
    @Autowired
    ShortenerService service;

    @RequestMapping("/{shortKey}")
    void redirectMe(@PathVariable String shortKey, HttpServletResponse response) {
        String longUrl = service.getRedirectUrl(shortKey);
        response.addHeader("Location", longUrl);
        response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
    }
}
