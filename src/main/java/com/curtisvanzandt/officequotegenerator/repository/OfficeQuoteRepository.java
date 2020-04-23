package com.curtisvanzandt.officequotegenerator.repository;

import com.curtisvanzandt.officequotegenerator.model.OfficeQuote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeQuoteRepository extends JpaRepository<OfficeQuote, Long> {

}
