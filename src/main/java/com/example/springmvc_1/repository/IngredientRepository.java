package com.example.springmvc_1.repository;

import com.example.springmvc_1.entity.Ingredient;
import com.example.springmvc_1.entity.Type;
import org.springframework.stereotype.Repository;


import java.util.Arrays;
import java.util.List;

@Repository
public class IngredientRepository implements Repo<Ingredient> {
    private final List<Ingredient> ingredientList;

    public IngredientRepository() {
        this.ingredientList = Arrays.asList(
                new Ingredient("lv", "Лаваш", Type.BREAD),
                new Ingredient("bl", "Булочка", Type.BREAD),
                new Ingredient("kr", "Курица", Type.MEAT),
                new Ingredient("gv", "Говядина", Type.MEAT),
                new Ingredient("og", "Огурчики", Type.VEGETABLES),
                new Ingredient("sal", "Салатик", Type.VEGETABLES),
                new Ingredient("cap", "Капусточка", Type.VEGETABLES),
                new Ingredient("isl", "1000 островов", Type.SAUCES),
                new Ingredient("kisl", "Кисло-сладкий", Type.SAUCES),
                new Ingredient("che", "Сырный", Type.SAUCES)
        );
    }

    @Override
    public Ingredient fidById(String id) {
        for (Ingredient ingredient : ingredientList) {
            if (ingredient.getId().equals(id)) return ingredient;
        }
        return null;
    }

    @Override
    public List<Ingredient> findAll() {
        return ingredientList;
    }

    @Override
    public void save(Ingredient ingredient) {

    }
}