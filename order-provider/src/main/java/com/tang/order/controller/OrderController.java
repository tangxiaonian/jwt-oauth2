package com.tang.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/get")
    public Map<String, String> getOrder() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "tang");
        map.put("age", "18");
        return map;
    }

}
