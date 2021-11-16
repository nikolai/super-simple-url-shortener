package com.example.UrlShortener.service;

import com.example.UrlShortener.repository.UrlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ngsmirnov
 */
@Service
public class ShortenerService {

    @Autowired
    private UrlRepo repo;

    public String shorten(String longUrl) {
        String shortKey = Integer.toHexString(longUrl.hashCode());
        repo.store(longUrl, shortKey);
        return "http://localhost:8080/" + shortKey;
    }


    public String getRedirectUrl(String shortKey) {
        String longUrl = repo.find(shortKey);
        return longUrl;
    }
}
