package com.biba.heroserver.dto;

import com.biba.heroserver.entity.Hero;
import org.springframework.stereotype.Component;

@Component
public class HeroMapper implements Mapper<Hero, HeroDTO> {


	@Override
	public HeroDTO mapToDTO(Hero enity) {
		HeroDTO dto = new HeroDTO();

		dto.setId(enity.getId());
		dto.setName(enity.getName());
		dto.setAttackPower(enity.getStrength()*2 + enity.getDexterity());

		return dto;
	}

	@Override
	public Hero mapToEntity(HeroDTO dto) {
		return new Hero();
	}
}
