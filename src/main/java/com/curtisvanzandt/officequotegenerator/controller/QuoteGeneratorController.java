package com.curtisvanzandt.officequotegenerator.controller;

import com.curtisvanzandt.officequotegenerator.model.OfficeQuote;
import com.curtisvanzandt.officequotegenerator.repository.OfficeQuoteRepository;
import com.curtisvanzandt.officequotegenerator.service.OfficeQuoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class QuoteGeneratorController {
    private static final Logger log = LoggerFactory.getLogger(QuoteGeneratorController.class);

    @Autowired
    OfficeQuoteService officeQuoteService;

    @GetMapping("/")
    public void homeController(final @RequestParam Integer season, final @RequestParam Integer episode) {
        officeQuoteService.saveNewQuote(officeQuoteService.createNewQuote(season, episode));
    }
}
