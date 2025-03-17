package com.eaztbytes.springsection1.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class ContactController {
    @GetMapping("/myContact")
    public String getContact() {
        return "Here are my contact details from db";
    }
}
