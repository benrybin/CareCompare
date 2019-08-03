package com.example.CareCompare.Models;

import javax.persistence.*;
import java.util.List;
import java.util.Map;
@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name="lineOne")
    private String lineOne;
    @Column(name="lineTwo")
    private String lineTwo;
    private String city;
    private String state;
    private String zip;



    private String namehosp;
    @Transient
    private Map prices;

    public Hospital(final String lineOne, final String lineTwo, final String city, final String state, final String zip, final String name) {
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.namehosp = name;
    }

    public Hospital() {
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getLineOne() {
        return this.lineOne;
    }

    public void setLineOne(final String lineOne) {
        this.lineOne = lineOne;
    }

    public String getLineTwo() {
        return this.lineTwo;
    }

    public void setLineTwo(final String lineTwo) {
        this.lineTwo = lineTwo;
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

    public String getZip() {
        return this.zip;
    }

    public void setZip(final String zip) {
        this.zip = zip;
    }

    public String getName() {
        return this.namehosp;
    }

    public void setName(final String name) {
        this.namehosp = name;
    }

    public Map getPrices() {
        return this.prices;
    }

    public void setPrices(final Map prices) {
        this.prices = prices;
    }

    public String getNamehosp() {
        return this.namehosp;
    }

    public void setNamehosp(final String namehosp) {
        this.namehosp = namehosp;
    }
}
