package br.com.poc.tic.tac.toe.dto.erros;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
	private List<String> jogo = new ArrayList<String>(2);
	
	public EntityGame convertEntityGame() {
		
		StringBuilder positionsGame = new StringBuilder();
		this.jogo.forEach(item ->{
			positionsGame.append(item);
		});
		
		EntityGame entityGame = new EntityGame();
		entityGame.setPositionsGame(positionsGame.toString());
		return entityGame;
	} 
}



