package com.tang.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/user")
public class LoginController {

    @GetMapping("/login")
    public Map<String, String> userLogin(String username, String password) {
        return null;
    }
}
