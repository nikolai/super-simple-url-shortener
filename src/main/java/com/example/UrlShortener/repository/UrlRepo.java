package com.example.UrlShortener.repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

/**
 * @author ngsmirnov
 */
@Repository
public class UrlRepo {

    private final Map<String, String> keyValue = new ConcurrentHashMap<>();

    public void store(String longUrl, String shortKey) {
        keyValue.put(shortKey, longUrl);
    }

    public String find(String shortKey) {
        return keyValue.get(shortKey);
    }

}
