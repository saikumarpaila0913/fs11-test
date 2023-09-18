package com.geekster.URLhitter.Repo;

import lombok.Getter;
import lombok.Setter;

public class UserHitCount {
    @Getter @Setter
    private String username;
    private int hitCount;

    public UserHitCount(String username, int hitCount) {
        this.username = username;
        this.hitCount = hitCount;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int gethitCount(){
        return this.hitCount;
    }

    // Getters and setters
}
