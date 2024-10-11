package com.github.umarshabazov.tacocloud.tacos.data;

import com.github.umarshabazov.tacocloud.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository <Ingredient,String> {

}