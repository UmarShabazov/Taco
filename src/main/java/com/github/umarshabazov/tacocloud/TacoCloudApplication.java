package com.github.umarshabazov.tacocloud;

import com.github.umarshabazov.tacocloud.tacos.Ingredient;
import com.github.umarshabazov.tacocloud.tacos.Ingredient.Type;
import com.github.umarshabazov.tacocloud.tacos.User;
import com.github.umarshabazov.tacocloud.tacos.data.IngredientRepository;
import com.github.umarshabazov.tacocloud.tacos.data.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class TacoCloudApplication {


	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}
