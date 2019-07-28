package com.example.CareCompare.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import java.util.Map;
@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private Map prices;
    private Address address;

    public Hospital(final String name, final Map prices) {
        this.name = name;
        this.prices = prices;
    }

    public Hospital(final String name, final Map prices, final Address address) {
        this.name = name;
        this.prices = prices;
        this.address = address;
    }


    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Map getPrices() {
        return this.prices;
    }

    public void setPrices(final Map prices) {
        this.prices = prices;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }
}
