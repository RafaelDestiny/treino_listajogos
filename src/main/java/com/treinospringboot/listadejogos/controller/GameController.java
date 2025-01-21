package com.treinospringboot.listadejogos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinospringboot.listadejogos.dto.gameminDTO;
import com.treinospringboot.listadejogos.service.GameService;

@RestController
@RequestMapping(value = "/games")


public class GameController {
	
	@Autowired GameService gameService;
	
	@GetMapping
	public List<gameminDTO> findAll(){
		List<gameminDTO> resultado = gameService.findAll();
		return resultado;
		
	}

}
