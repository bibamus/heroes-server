package com.biba.heroserver.repository;

import com.biba.heroserver.entity.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface HeroRepository extends JpaRepository<Hero, Long> {
}
