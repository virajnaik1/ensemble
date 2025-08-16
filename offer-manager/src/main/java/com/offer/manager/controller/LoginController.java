package com.offer.manager.controller;

import com.offer.manager.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/secured/login")
    public String login() {
        return loginService.verify();
    }
}
