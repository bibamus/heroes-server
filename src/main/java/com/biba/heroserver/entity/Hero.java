package com.biba.heroserver.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hero implements Creature {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private Long strength = 0L;
	private Long dexterity = 0L;
	private Long intelligence = 0L;
	private Long stamina = 0L;

	@Override
	public Long attackPower() {
		return 0L;
	}

	public Long getStrength() {
		return strength;
	}

	public void setStrength(Long strength) {
		this.strength = strength;
	}

	public Long getDexterity() {
		return dexterity;
	}

	public void setDexterity(Long dexterity) {
		this.dexterity = dexterity;
	}

	public Long getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Long intelligence) {
		this.intelligence = intelligence;
	}

	public Long getStamina() {
		return stamina;
	}

	public void setStamina(Long stamina) {
		this.stamina = stamina;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
