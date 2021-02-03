package br.com.poc.tic.tac.toe.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.poc.tic.tac.toe.dto.erros.DtoGame;
import br.com.poc.tic.tac.toe.entity.EntityGame;
import br.com.poc.tic.tac.toe.service.CheckExistsWinnerService;
import br.com.poc.tic.tac.toe.service.UtilService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TicTacToeResource {
	
	@Autowired
	private UtilService utilService;
	
	@Autowired
	private CheckExistsWinnerService checkWinnerService;

	@ApiOperation(value = "Informe um Jogo da Velha Concluído")
	@PostMapping(path = "/jogovelha")
	public ResponseEntity<EntityGame> isVelhaResource(@RequestBody @Valid DtoGame dto) {
		
		EntityGame entityGame = dto.convertEntityGame();
		int[] jogo = this.utilService.convertStringInCollectionNumber(entityGame.getPositionsGame());
		this.checkWinnerService.isVelha(jogo);
		
		return new ResponseEntity<EntityGame>(HttpStatus.OK);
	}
	
}
