package com.biba.heroserver.service;

import com.biba.heroserver.entity.Hero;
import com.biba.heroserver.repository.HeroRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

@Service
public class HeroService {

	@Resource
	private HeroRepository heroRepository;

	public Collection<Hero> getAllHeroes() {
		return heroRepository.findAll();
	}
}
