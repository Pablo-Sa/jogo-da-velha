package br.com.poc.tic.tac.toe.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EntityGameTest {
	
	private EntityGame entityGame;
	private static final String TEST_CASE_SUCESS = "OOXXOXXOX"; 
	private static final String TEST_CASE_ERROR = "OOXXOXXXX";
	
	@BeforeEach
	public void configEntityGame() {
		this.entityGame = new EntityGame();
		this.entityGame.setPositionsGame(TEST_CASE_SUCESS);
	}
	
	@Test
	public void entityGameTestSucess() {
		assertEquals(this.entityGame.getPositionsGame(), TEST_CASE_SUCESS);
	}
	
	@Test
	public void entityGameTestError() {
		assertNotEquals(this.entityGame.getPositionsGame(), TEST_CASE_ERROR);
	}

}
