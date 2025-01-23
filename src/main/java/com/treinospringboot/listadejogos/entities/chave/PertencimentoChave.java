package com.treinospringboot.listadejogos.entities.chave;

import java.util.Objects;

import com.treinospringboot.listadejogos.entities.Game;
import com.treinospringboot.listadejogos.entities.lista.GameLista;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class PertencimentoChave {
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game game;
	@ManyToOne
	@JoinColumn(name = "list_id")
	private GameLista gameLista;
	 
	public PertencimentoChave() {
		
	}

	public PertencimentoChave(Game game, GameLista gameLista) {
		
		this.game = game;
		this.gameLista = gameLista;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameLista getGameLista() {
		return gameLista;
	}

	public void setGameLista(GameLista gameLista) {
		this.gameLista = gameLista;
	}

	@Override
	public int hashCode() {
		return Objects.hash(game, gameLista);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PertencimentoChave other = (PertencimentoChave) obj;
		return Objects.equals(game, other.game) && Objects.equals(gameLista, other.gameLista);
	}

	
}

