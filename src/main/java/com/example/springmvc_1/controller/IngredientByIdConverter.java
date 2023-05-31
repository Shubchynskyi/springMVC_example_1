package com.example.springmvc_1.controller;

import com.example.springmvc_1.entity.Ingredient;
import com.example.springmvc_1.repository.IngredientRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
    private final IngredientRepository ingredientRepository;

    public IngredientByIdConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String id) {
        Ingredient ingredient = null;
        final List<Ingredient> all = ingredientRepository.findAll();
        for (Ingredient currentIngredient : all) {
            if (currentIngredient.getId().equals(id)) {
                ingredient = currentIngredient;
            }
        }
        return ingredient;
    }

}