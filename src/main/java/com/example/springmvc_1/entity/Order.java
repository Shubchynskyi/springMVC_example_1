package com.example.springmvc_1.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Order {
    private String deliveryName;

    private String deliveryStreet;

    private String deliveryCity;

    private String deliveryZip;

    private String ccNumber;

    private String ccExpiration;

    private String ccCVV;

    private List<Shawarma> shawarmas = new ArrayList<>();

    public void addShawarma(Shawarma shawarma) {
        this.shawarmas.add(shawarma);
    }
}
