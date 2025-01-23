package com.treinospringboot.listadejogos.repository.lista;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinospringboot.listadejogos.entities.lista.GameLista;

public interface ListaRepository extends JpaRepository<GameLista, Long> {

}
