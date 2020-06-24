package com.tang.auth.controller;

import io.jsonwebtoken.Jwts;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;

@RequestMapping("/auth")
@RestController
public class LoginController {

    @GetMapping("/userInfo")
    public Object userInfo(HttpServletRequest request) {

        String header = request.getHeader("Authorization");

        Assert.notNull(header,"header is null!");

        return Jwts.parser()
                .setSigningKey("test_key".getBytes(StandardCharsets.UTF_8))
                .parseClaimsJws(header.substring(7))
                .getBody();
    }

}
