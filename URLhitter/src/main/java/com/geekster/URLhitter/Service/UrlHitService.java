package com.geekster.URLhitter.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {

    private int hitCount = 0;
    private Map<String, Integer> userHitCounts = new HashMap<>();

    public int getHitCount() {
        return hitCount++;
    }

    public int getUserHitCount(String username) {
       int count= userHitCounts.getOrDefault(username,0)+1;
        userHitCounts.put(username,count);
        return userHitCounts.getOrDefault(username, 0);
    }
}
