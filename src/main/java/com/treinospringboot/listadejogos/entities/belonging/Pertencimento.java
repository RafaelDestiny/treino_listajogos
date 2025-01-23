package com.treinospringboot.listadejogos.entities.belonging;


import java.util.Objects;

import com.treinospringboot.listadejogos.entities.Game;
import com.treinospringboot.listadejogos.entities.chave.PertencimentoChave;
import com.treinospringboot.listadejogos.entities.lista.GameLista;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Pertencimento {
	
	@EmbeddedId
	private PertencimentoChave id = new PertencimentoChave();
	
	private Integer position;
	
	public Pertencimento() {
		
	}

	public Pertencimento(Game game, GameLista gameLista, Integer position) {
	
		id.setGame(game);
		id.setGameLista(gameLista);
		this.position = position;
	}

	public PertencimentoChave getId() {
		return id;
	}

	public void setId(PertencimentoChave id) {
		this.id = id;
	}

	public Integer getPosicao() {
		return position;
	}

	public void setPosicao(Integer posicao) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pertencimento other = (Pertencimento) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
