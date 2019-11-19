package com.heron.graphql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by heron.lee 2019-11-18
 */
@Entity
@Table(name = "coffee")
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int price;

    public int getId() {
        return id;
    }
    public String getName () {
        return name;
    }
    public int getPrice () {
        return price;
    }
    public void setId (int id) {
        this.id = id;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setPrice (int price) {
        this.price = price;
    }
}
