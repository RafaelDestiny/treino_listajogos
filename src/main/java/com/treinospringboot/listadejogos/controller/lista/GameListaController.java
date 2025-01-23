package com.treinospringboot.listadejogos.controller.lista;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinospringboot.listadejogos.entities.listadto.GameListaDto;
import com.treinospringboot.listadejogos.service.lista.ListaService;


@RestController
@RequestMapping(value = "/lista")

public class GameListaController {
	
	@Autowired ListaService listaService;
	
	@GetMapping
	public List<GameListaDto> findAll(){
		List<GameListaDto> resultado = listaService.findAll();
		return resultado;
	}

}
