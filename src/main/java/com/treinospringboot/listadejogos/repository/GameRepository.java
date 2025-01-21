package com.treinospringboot.listadejogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinospringboot.listadejogos.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
