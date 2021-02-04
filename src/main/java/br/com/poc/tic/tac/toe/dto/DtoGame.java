package br.com.poc.tic.tac.toe.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.poc.tic.tac.toe.config.beancustomvalidators.GameInputInvalid;
import br.com.poc.tic.tac.toe.entity.EntityGame;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DtoGame {

	@NotEmpty
	@NotNull
	@GameInputInvalid
	private String[] jogo = new String[3];

	public EntityGame convertEntityGame() {
		StringBuilder positionsGame = new StringBuilder();

		for(String item: this.jogo) {
			positionsGame.append(item.toUpperCase());			
		}
		
		EntityGame entityGame = new EntityGame();
		entityGame.setPositionsGame(positionsGame.toString());
		return entityGame;
	} 
}



