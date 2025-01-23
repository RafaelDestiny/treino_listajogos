package com.treinospringboot.listadejogos.service.lista;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.treinospringboot.listadejogos.entities.lista.GameLista;
import com.treinospringboot.listadejogos.entities.listadto.GameListaDto;
import com.treinospringboot.listadejogos.repository.lista.ListaRepository;


 
@Service
public class ListaService {
	
	
	@Autowired 
	private ListaRepository listaRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameListaDto> findAll(){
	
		List<GameLista> resultado = listaRepository.findAll();
	List<GameListaDto> dto = resultado.stream().map(x -> new GameListaDto(x)).toList();
	return dto;
		
		
		
	}

}
