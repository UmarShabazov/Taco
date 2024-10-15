package com.github.umarshabazov.tacocloud.tacos;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
@Entity
public class Taco {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private Date createdAt = new Date();

    @NotNull
    @Size (min=5, message = "Name should be at least 5 characters long")
    private String name;

    @ManyToMany
    private List<Ingredient> ingredients;
    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
}
