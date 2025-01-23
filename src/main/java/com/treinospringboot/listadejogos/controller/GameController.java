package com.treinospringboot.listadejogos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinospringboot.listadejogos.entities.dto.GameDto;
import com.treinospringboot.listadejogos.entities.min.GameMinDTO;
import com.treinospringboot.listadejogos.service.GameService;

@RestController
@RequestMapping(value = "/games")


public class GameController {
	
	@Autowired GameService gameService;
	
	
	@GetMapping(value = "/{id}")
	public GameDto findById(@PathVariable Long id){
		GameDto resultado = gameService.findById(id);
		return resultado;
		
	}

	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> resultado = gameService.findAll();
		return resultado;
		
	}

}
