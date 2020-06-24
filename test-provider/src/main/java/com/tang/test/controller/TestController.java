package com.tang.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/index")
    public String index(HttpServletRequest request) {

        Enumeration<String> headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            String element = headerNames.nextElement();
            System.out.println(element + "---->" + request.getHeader(element));
        }

        return "index...test...";
    }

}
