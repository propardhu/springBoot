package com.pardhu.services;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class reviewmodel {
    @Id
    private String id;
    private String name;
    private String review;

    public reviewmodel() {//lombak
    }

    public reviewmodel(String id, String name, String review) {
        super();
        this.id = id;
        this.name = name;
        this.review = review;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
