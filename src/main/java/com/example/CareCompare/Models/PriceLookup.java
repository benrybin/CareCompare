package com.example.CareCompare.Models;

import javax.persistence.*;

@Entity
public class PriceLookup {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Hospital hosp;
    @ManyToOne
    private Procedures proc;
    private Double price;


    public Integer getId() {
        return this.id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Hospital getHosp() {
        return this.hosp;
    }

    public void setHosp(final Hospital hosp) {
        this.hosp = hosp;
    }

    public Procedures getProc() {
        return this.proc;
    }

    public void setProc(final Procedures proc) {
        this.proc = proc;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(final Double price) {
        this.price = price;
    }

}
