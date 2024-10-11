package com.github.umarshabazov.tacocloud.tacos.data;

import com.github.umarshabazov.tacocloud.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository <Ingredient,String> {

}