package com.example.CareCompare.Models;

import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;


public class Address {
    private String firstLine;
    private String secondLine;
    private Integer zip;
    private String city;
    private String state;

    public Address(final String firstLine, final String secondLine, final Integer zip, final String city, final String state) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }

    public Address(final String firstLine, final Integer zip, final String city, final String state) {
        this.firstLine = firstLine;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }

    public String getFirstLine() {
        return this.firstLine;
    }

    public void setFirstLine(final String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLine() {
        return this.secondLine;
    }

    public void setSecondLine(final String secondLine) {
        this.secondLine = secondLine;
    }

    public Integer getZip() {
        return this.zip;
    }

    public void setZip(final Integer zip) {
        this.zip = zip;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(final String state) {
        this.state = state;
    }
}
