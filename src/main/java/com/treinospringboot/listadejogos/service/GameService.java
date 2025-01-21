package com.treinospringboot.listadejogos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinospringboot.listadejogos.dto.gameminDTO;
import com.treinospringboot.listadejogos.entities.Game;
import com.treinospringboot.listadejogos.repository.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	public List<gameminDTO> findAll(){
	List<Game> resultado = 	gameRepository.findAll();
	List<gameminDTO> dto = resultado.stream().map(x -> new gameminDTO(x)).toList();
	return dto;
		
		
		
	}
	

}
