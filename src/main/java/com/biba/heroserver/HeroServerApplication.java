package com.biba.heroserver;

import com.biba.heroserver.entity.Hero;
import com.biba.heroserver.repository.HeroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class HeroServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroServerApplication.class, args);
	}

	@Bean
	CommandLineRunner init(HeroRepository heroRepository){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Hero hero1 = new Hero();
				hero1.setName("Kunibert");
				hero1.setStrength(2L);
				hero1.setDexterity(3L);

				heroRepository.save(hero1);
			}
		};
	}
}
