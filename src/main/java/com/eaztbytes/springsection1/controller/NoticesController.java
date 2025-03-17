package com.eaztbytes.springsection1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    @GetMapping("/myNotices")
    public String getNotices() {
        return "Here are my notices details from db";
    }
}
