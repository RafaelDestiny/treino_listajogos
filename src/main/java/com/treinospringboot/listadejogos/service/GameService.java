package com.treinospringboot.listadejogos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.treinospringboot.listadejogos.entities.Game;
import com.treinospringboot.listadejogos.entities.dto.GameDto;
import com.treinospringboot.listadejogos.entities.min.GameMinDTO;
import com.treinospringboot.listadejogos.repository.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDto findById(Long id) {
		
		Game resultado = gameRepository.findById(id).get();
		
		return new GameDto(resultado);
		
	} 
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
	List<Game> resultado = 	gameRepository.findAll();
	List<GameMinDTO> dto = resultado.stream().map(x -> new GameMinDTO(x)).toList();
	return dto;
		
		
		
	}
	

}
