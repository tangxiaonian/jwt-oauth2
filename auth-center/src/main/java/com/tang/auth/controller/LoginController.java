package com.tang.auth.controller;

import io.jsonwebtoken.Jwts;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;

@RequestMapping("/oauth")
@RestController
public class LoginController {

    @GetMapping("/userInfo")
    public Object userInfo(HttpServletRequest request) {

        String token = request.getHeader("Authorization");

//        Enumeration<String> headerNames = request.getHeaderNames();
//
//        while (headerNames.hasMoreElements()) {
//            String key = headerNames.nextElement();
//            System.out.println(key + "---->" + request.getHeader(key));
//        }

        Assert.notNull(token,"token is null!");

        return Jwts.parser()
                .setSigningKey("test_key".getBytes(StandardCharsets.UTF_8))
                .parseClaimsJws(token.substring(7))
                .getBody();
    }

}
