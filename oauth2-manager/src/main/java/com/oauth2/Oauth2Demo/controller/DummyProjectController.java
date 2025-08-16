package com.oauth2.Oauth2Demo.controller;

import com.oauth2.Oauth2Demo.service.DummyProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DummyProjectController {
    private Logger logger = LoggerFactory.getLogger(DummyProjectController.class);

    @Autowired
    private DummyProjectService dummyProjectService;

    @GetMapping("/secured/offers")
    public String getOfferings() {
        return dummyProjectService.getOffers().getBody();
    }
}
