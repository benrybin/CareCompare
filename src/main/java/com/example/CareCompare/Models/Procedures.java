package com.example.CareCompare.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Procedures {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String code;
    private String descrip;
    @ManyToMany
    private List<Tags> tags;

    public Integer getId() {
        return this.id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public String getDescrip() {
        return this.descrip;
    }

    public void setDescrip(final String descrip) {
        this.descrip = descrip;
    }

    public List<Tags> getTags() {
        return this.tags;
    }

    public void setTags(final List<Tags> tags) {
        this.tags = tags;
    }


}
