package br.com.poc.tic.tac.toe.resources;

import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.poc.tic.tac.toe.dto.erros.DtoGame;
import br.com.poc.tic.tac.toe.entity.EntityGame;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TicTacToeResource {

	@ApiOperation(value = "Informe um Jogo da Velha Concluído")
	@PostMapping(path = "/jogovelha")
	public ResponseEntity<?> isVelhaResource(@RequestBody @Valid DtoGame dto) {
		EntityGame entityGame = dto.convertEntityGame();
		int[] jogo = this.convertStringInCollectionNumber(entityGame.getPositionsGame());
		this.isVelha(jogo);
		return new ResponseEntity<EntityGame>(entityGame, HttpStatus.OK);
	}
	
	public boolean isVelha(int[] jogo) {

		return true;
		
	}
	
	public int[] convertStringInCollectionNumber(String positionsGame) {
		final int CIRCLE = 0;
		final int CROSS = 1;
		final char isCROSS = 'X'; 
		int[] positionsGameInNumber = new int[9];
		
		for (int i = 0; i < positionsGame.length(); i++) {
			positionsGameInNumber[i] = positionsGame.charAt(i) == isCROSS ? CROSS: CIRCLE;
		}

		return positionsGameInNumber;
	}
}
