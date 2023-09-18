package com.geekster.URLhitter.Controller;

import com.geekster.URLhitter.Repo.UserHitCount;
import com.geekster.URLhitter.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

  //@RequestMapping("/api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    private UrlHitService urlHitService;

    @GetMapping("/count")
    public int getHitCount() {
        return urlHitService.getHitCount();
    }

    @GetMapping("/username/{username}/count")
    public UserHitCount getUserHitCount(@PathVariable String username) {
        int hitCount = urlHitService.getUserHitCount(username);
        return new UserHitCount(username, hitCount);
    }
}
