package br.com.poc.jogo.velha.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.poc.tic.tac.toe.dto.DtoGame;
import br.com.poc.tic.tac.toe.entity.EntityGame;

public class DtoGameTest {

	@Test
	void contextLoads() {

	}

	private DtoGame dtoGame;
	private EntityGame entityGame;
	private String positionsGameSucess = "OOXXOXXOX";
	private String positionsGameError = "XXXXOXXXX";
	private static final String DTO_GAME_FOR_ENTITY = "OOXXOXXOX";
	private String[] data;

	@BeforeEach
	public void configEntityGame() {
		this.data = new String[3];
		this.dtoGame = new DtoGame();
		this.entityGame = new EntityGame();
	}

	@Test
	public void dtoGameAtributeTestSucess() {
		this.data[0] = this.positionsGameSucess.substring(0, 3);
		this.data[1] = this.positionsGameSucess.substring(3, 6);
		this.data[2] = this.positionsGameSucess.substring(6, 9);
		this.dtoGame.setJogo(this.data);
		assertEquals(this.dtoGame.getJogo(), this.data);
	}
	
	@Test
	public void dtoGameAtributeTestError() {
		this.data[0] = this.positionsGameError.substring(0, 3);
		this.data[1] = this.positionsGameError.substring(3, 6);
		this.data[2] = this.positionsGameError.substring(6, 9);
		assertNotEquals(this.dtoGame.getJogo(), this.data);
	}
	
	@Test
	public void dtoGameConvertForEntityTest() {
		this.data[0] = this.positionsGameSucess.substring(0, 3);
		this.data[1] = this.positionsGameSucess.substring(3, 6);
		this.data[2] = this.positionsGameSucess.substring(6, 9);
		this.dtoGame.setJogo(this.data);
		this.entityGame.setPositionsGame(positionsGameSucess);
		assertEquals(this.entityGame.getPositionsGame(), this.dtoGame.convertEntityGame().getPositionsGame());
	}
	
}
