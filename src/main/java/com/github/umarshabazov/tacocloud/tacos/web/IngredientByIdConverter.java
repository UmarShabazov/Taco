package com.github.umarshabazov.tacocloud.tacos.web;

import com.github.umarshabazov.tacocloud.tacos.Ingredient;
import com.github.umarshabazov.tacocloud.tacos.data.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.github.umarshabazov.tacocloud.tacos.Ingredient.Type;

import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientByIdConverter implements Converter <String, Ingredient> {

    private final IngredientRepository ingredientRepository;

    @Autowired
    IngredientByIdConverter (IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }


    @Override
    public Ingredient convert (String id) {

        return ingredientRepository.findById(id).orElse(null);
    }


}
