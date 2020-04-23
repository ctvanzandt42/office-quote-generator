package com.curtisvanzandt.officequotegenerator.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "quotes")
public class OfficeQuote implements Serializable {

    public OfficeQuote(String quote, Integer season, Integer episode, String personQuoted) {
        this.quote = quote;
        this.season = season;
        this.episode = episode;
        this.personQuoted = personQuoted;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String quote;

    @Column
    private Integer season;

    @Column
    private Integer episode;
    @Column
    private String personQuoted;

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getEpisode() {
        return episode;
    }

    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    public String getPersonQuoted() {
        return personQuoted;
    }

    public void setPersonQuoted(String personQuoted) {
        this.personQuoted = personQuoted;
    }

    @Override
    public String toString() {
        return "OfficeQuote{" +
                "quote='" + quote + '\'' +
                ", season=" + season +
                ", episode=" + episode +
                ", personQuoted='" + personQuoted + '\'' +
                '}';
    }
}
