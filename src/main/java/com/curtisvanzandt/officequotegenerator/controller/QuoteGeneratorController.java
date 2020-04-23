package com.curtisvanzandt.officequotegenerator.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class QuoteGeneratorController {
    private static final String SUCCESS_MESSAGE = "Controller is working correctly";
    private static final Logger log = LoggerFactory.getLogger(QuoteGeneratorController.class);

    @GetMapping("/")
    public String homeController() {
        log.info("Home page hit");
        return SUCCESS_MESSAGE;
    }
}
