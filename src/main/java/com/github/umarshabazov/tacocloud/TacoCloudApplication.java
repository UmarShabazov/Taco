package com.github.umarshabazov.tacocloud;

import com.github.umarshabazov.tacocloud.tacos.Ingredient;
import com.github.umarshabazov.tacocloud.tacos.Ingredient.Type;
import com.github.umarshabazov.tacocloud.tacos.data.IngredientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TacoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}
