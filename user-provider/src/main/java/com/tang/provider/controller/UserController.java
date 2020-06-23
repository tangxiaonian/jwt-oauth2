package com.tang.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/index")
    public Map<String, String> index() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "tang");
        map.put("age", "18");
        return map;
    }

}
