package com.biba.heroserver.controller;

import com.biba.heroserver.dto.HeroDTO;
import com.biba.heroserver.dto.Mapper;
import com.biba.heroserver.entity.Hero;
import com.biba.heroserver.service.HeroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/hero")
public class HeroController {

	@Resource
	HeroService heroService;

	@Resource
	Mapper<Hero, HeroDTO> mapper;

	@RequestMapping()
	public ResponseEntity<Collection<HeroDTO>> getAllHeros(){
		List<HeroDTO> heroDTOS = heroService.getAllHeroes().stream().map(hero -> mapper.mapToDTO(hero)).collect(Collectors.toList());
		return new ResponseEntity<>(heroDTOS,HttpStatus.OK);
	}
}
