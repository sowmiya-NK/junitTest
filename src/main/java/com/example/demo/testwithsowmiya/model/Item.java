package com.example.demo.testwithsowmiya.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;


@Entity
@Data
public class Item {

    @Id
    private int id;
    private String name;
    private double price;
    private int quantity;

    @Transient
    private double value;


    public Item(int i, String maggi, double v, int i1) {
        this.id = i;
        this.name = maggi;
        this.price = v;
        this.quantity = i1;
    }


}
