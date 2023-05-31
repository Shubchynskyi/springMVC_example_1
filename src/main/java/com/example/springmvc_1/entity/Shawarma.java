package com.example.springmvc_1.entity;

import lombok.Data;

import java.util.List;

@Data
public class Shawarma {
    private String name;
    private List<Ingredient> ingredients;

}
