package com.upiiz.superheroes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upiiz.superheroes.entities.HeroeEntity;

@Repository
public interface HeroeRepository extends JpaRepository<HeroeEntity, Long> {
}