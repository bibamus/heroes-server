package com.biba.heroserver.dto;

import static org.assertj.core.api.Assertions.*;

import com.biba.heroserver.entity.Hero;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeroMapperTest {


	@Resource
	private HeroMapper heroMapper;

	@Test
	public void mapEntityToDTOTest(){
		Hero hero = new Hero();
		hero.setName("Test");
		hero.setStrength(2L);
		hero.setDexterity(3L);

		HeroDTO heroDTO = heroMapper.mapToDTO(hero);

		assertThat(heroDTO.getName()).isEqualTo("Test");
		assertThat(heroDTO.getAttackPower()).isEqualTo(7L);
	}
}
