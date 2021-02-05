package br.com.poc.tic.tac.toe.resource;

import static org.junit.Assert.assertNotNull;
import static org.mockito.BDDMockito.given;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.poc.tic.tac.toe.dto.DtoGame;
import br.com.poc.tic.tac.toe.resources.TicTacToeResource;
import br.com.poc.tic.tac.toe.service.CheckExistsWinnerService;
import br.com.poc.tic.tac.toe.service.UtilService;

public class TicTacToeResourceTest {

	@Mock
	private UtilService utilServiceTest;
	
	@Mock
	private CheckExistsWinnerService checkWinnerServiceTest;
		
	@InjectMocks
	private TicTacToeResource ticTacToeResourceTest;

	private DtoGame dtoGame;
	private String[] gameExists;
	private static final String POSITIONS_GAME = "XXOOXOOOX";
	private int[] collectionsNumber = new int[9];
	
	@BeforeEach
	public void configResponses() {
		MockitoAnnotations.initMocks(this);
		this.collectionsNumber[0] = 1;
		this.collectionsNumber[1] = 1;
		this.collectionsNumber[2] = 0;
		this.collectionsNumber[3] = 0;
		this.collectionsNumber[4] = 1;
		this.collectionsNumber[5] = 0;
		this.collectionsNumber[6] = 0;
		this.collectionsNumber[7] = 0;
		this.collectionsNumber[8] = 1;
		this.gameExists = new String[3];
		this.dtoGame = new DtoGame();
		this.gameExists[0] = "XXO";
		this.gameExists[1] = "OXO";
		this.gameExists[2] = "OOX";
		this.dtoGame.setJogo(this.gameExists);
	}

	@Test
	public void PostGameIsWinner() {
		given(this.utilServiceTest.convertStringInCollectionNumber(POSITIONS_GAME))
		.willReturn(this.collectionsNumber);
		
		given(this.checkWinnerServiceTest.isVelha(Mockito.any()))
		.willReturn(Boolean.TRUE);
		
		assertNotNull(this.ticTacToeResourceTest.isVelhaResource(this.dtoGame));
	}
	
	@Test
	public void PostGameIsVelha() {
		given(this.utilServiceTest.convertStringInCollectionNumber(POSITIONS_GAME))
		.willReturn(this.collectionsNumber);
		
		given(this.checkWinnerServiceTest.isVelha(Mockito.any()))
		.willReturn(Boolean.FALSE);
		
		assertNotNull(this.ticTacToeResourceTest.isVelhaResource(this.dtoGame));
	}

}
