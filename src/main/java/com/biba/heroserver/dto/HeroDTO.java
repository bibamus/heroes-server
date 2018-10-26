package com.biba.heroserver.dto;

public class HeroDTO {

	private Long id;

	private String name;

	private Long attackPower;

	public Long getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(Long attackPower) {
		this.attackPower = attackPower;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
