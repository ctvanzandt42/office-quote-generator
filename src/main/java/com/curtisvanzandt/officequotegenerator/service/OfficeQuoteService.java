package com.curtisvanzandt.officequotegenerator.service;

import com.curtisvanzandt.officequotegenerator.model.OfficeQuote;
import com.curtisvanzandt.officequotegenerator.repository.OfficeQuoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfficeQuoteService {
    private static final String MICHAEL_SCOTT = "Michael Scott";
    private static final String THATS_WHAT_SHE_SAID = "That's what she said!";
    private static final Logger log = LoggerFactory.getLogger(OfficeQuoteService.class);

    @Autowired
    OfficeQuoteRepository repository;

    public OfficeQuote createNewQuote(final Integer season, final Integer episode) {
        return new OfficeQuote(THATS_WHAT_SHE_SAID, season, episode, MICHAEL_SCOTT);
    }

    public void saveNewQuote(final OfficeQuote officeQuote) {
        repository.save(officeQuote);
        log.info(String.format("Quote saved: %s", officeQuote));
    }
}
