package br.com.poc.tic.tac.toe.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CheckExistsWinnerServiceTest {

	@InjectMocks
	private CheckExistsWinnerService checkExistsWinnerServiceTest;
	
	@Mock
	private CheckPossibilityOfWinnerService possibilityOfWinnerServiceTest;
	
	private int[] winnerGameTestCase;
	private int[] isVelhaTestCase;
	
	@BeforeEach
	void initResonse() {
		MockitoAnnotations.initMocks(this);
	}
	
	@BeforeEach
	public void configwinnerGameTestCaseTest() {
		this.winnerGameTestCase = new int[9];
		this.winnerGameTestCase[0] = 1;
		this.winnerGameTestCase[1] = 1;
		this.winnerGameTestCase[2] = 1;
		this.winnerGameTestCase[3] = 0;
		this.winnerGameTestCase[4] = 0;
		this.winnerGameTestCase[5] = 1;
		this.winnerGameTestCase[6] = 1;
		this.winnerGameTestCase[7] = 0;
		this.winnerGameTestCase[8] = 0;
	}
	
	@BeforeEach
	public void configIsVelhaCaseTest() {
		this.isVelhaTestCase = new int[9];
		this.isVelhaTestCase[0] = 1;
		this.isVelhaTestCase[1] = 1;
		this.isVelhaTestCase[2] = 0;
		this.isVelhaTestCase[3] = 0;
		this.isVelhaTestCase[4] = 0;
		this.isVelhaTestCase[5] = 1;
		this.isVelhaTestCase[6] = 1;
		this.isVelhaTestCase[7] = 1;
		this.isVelhaTestCase[8] = 0;
	}
	
	@Test
	public void CheckExistsWinnerServiceIsVelhaTest() {
		given(this.possibilityOfWinnerServiceTest.checkAllPossibilityOfWinner(Mockito.any()))
		.willReturn(Boolean.FALSE);
		assertFalse(this.checkExistsWinnerServiceTest.isVelha(this.isVelhaTestCase));
	}
	
	@Test
	public void checkExistsWinnerServiceTest() {
		given(this.possibilityOfWinnerServiceTest.checkAllPossibilityOfWinner(Mockito.any()))
		.willReturn(Boolean.TRUE);
		assertTrue(this.checkExistsWinnerServiceTest.isVelha(this.isVelhaTestCase));
	}
}
