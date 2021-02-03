package br.com.poc.tic.tac.toe.resources;

import java.util.Date;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.poc.tic.tac.toe.entity.EntityGame;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TicTacToeResource {

	
	@ApiOperation(value = "Informe um Jogo da Velha Concluído")
	@PostMapping(path = "/jogovelha")
	public ResponseEntity<?> savePeople(@RequestBody @Valid EntityGame people) {


		return new ResponseEntity<EntityGame>(people, HttpStatus.OK);
	}
}
