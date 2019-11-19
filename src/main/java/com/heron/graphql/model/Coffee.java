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

    public static Coffee DEFAULT_COFFEE = new Coffee(0, "Default Coffee", 0);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int price;

    public Coffee () { }
    public Coffee (String name, int price) {
        this.name = name;
        this.price = price;
    }
    public Coffee (int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getName () {
        return name;
    }
    public int getPrice () {
        return price;
    }
}
