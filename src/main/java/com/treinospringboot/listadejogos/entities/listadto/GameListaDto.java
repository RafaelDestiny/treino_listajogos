package com.treinospringboot.listadejogos.entities.listadto;

import com.treinospringboot.listadejogos.entities.lista.GameLista;

public class GameListaDto {
	
	private Long id;
	private String name;
	
	public GameListaDto() {
		
	}

	public GameListaDto (GameLista gameLista) {
		
		id = gameLista.getId();
		name = gameLista.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	

}
