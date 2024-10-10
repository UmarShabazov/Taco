package com.github.umarshabazov.tacocloud.tacos.data;

import com.github.umarshabazov.tacocloud.tacos.Ingredient;

import java.util.Optional;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}