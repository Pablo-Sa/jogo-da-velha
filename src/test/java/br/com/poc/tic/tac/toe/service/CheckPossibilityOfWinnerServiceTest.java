package br.com.poc.tic.tac.toe.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CheckPossibilityOfWinnerServiceTest {

	private CheckPossibilityOfWinnerService checkPossibilityOfWinnerServiceTest = new CheckPossibilityOfWinnerService();
	private int[] firstPossibilityTestCase;
	private int[] secondPossibilityTestCase;
	private int[] thirdPossibilityTestCase;
	private int[] fourthPossibilityTestCase;
	private int[] fifthPossibilityTestCase;
	private int[] sixthPossibilityTestCase;
	private int[] seventhPossibilityTestCase;
	private int[] eighthPossibilityTestCase;
	private int[] isVelhaTestCase;
	

	@BeforeEach
	public void configCheckPossibilityOfWinnerServiceFirstPossibilityTest() {
		this.firstPossibilityTestCase = new int[9];
		this.firstPossibilityTestCase[0] = 1;
		this.firstPossibilityTestCase[1] = 1;
		this.firstPossibilityTestCase[2] = 1;
		this.firstPossibilityTestCase[3] = 0;
		this.firstPossibilityTestCase[4] = 0;
		this.firstPossibilityTestCase[5] = 1;
		this.firstPossibilityTestCase[6] = 1;
		this.firstPossibilityTestCase[7] = 0;
		this.firstPossibilityTestCase[8] = 0;
	}
	
	@BeforeEach
	public void configCheckPossibilityOfWinnerServiceSecondPossibilityTest() {
		this.secondPossibilityTestCase = new int[9];
		this.secondPossibilityTestCase[0] = 0;
		this.secondPossibilityTestCase[1] = 1;
		this.secondPossibilityTestCase[2] = 0;
		this.secondPossibilityTestCase[3] = 1;
		this.secondPossibilityTestCase[4] = 1;
		this.secondPossibilityTestCase[5] = 1;
		this.secondPossibilityTestCase[6] = 1;
		this.secondPossibilityTestCase[7] = 0;
		this.secondPossibilityTestCase[8] = 0;
	}
	
	@BeforeEach
	public void configCheckPossibilityOfWinnerServiceThirdPossibilityTest() {
		this.thirdPossibilityTestCase = new int[9];
		this.thirdPossibilityTestCase[0] = 1;
		this.thirdPossibilityTestCase[1] = 1;
		this.thirdPossibilityTestCase[2] = 0;
		this.thirdPossibilityTestCase[3] = 0;
		this.thirdPossibilityTestCase[4] = 1;
		this.thirdPossibilityTestCase[5] = 1;
		this.thirdPossibilityTestCase[6] = 0;
		this.thirdPossibilityTestCase[7] = 0;
		this.thirdPossibilityTestCase[8] = 0;
	}
	
	@BeforeEach
	public void configCheckPossibilityOfWinnerServiceFourthPossibilityTest() {
		this.fourthPossibilityTestCase = new int[9];
		this.fourthPossibilityTestCase[0] = 1;
		this.fourthPossibilityTestCase[1] = 0;
		this.fourthPossibilityTestCase[2] = 1;
		this.fourthPossibilityTestCase[3] = 1;
		this.fourthPossibilityTestCase[4] = 0;
		this.fourthPossibilityTestCase[5] = 0;
		this.fourthPossibilityTestCase[6] = 1;
		this.fourthPossibilityTestCase[7] = 1;
		this.fourthPossibilityTestCase[8] = 0;
	}
	
	@BeforeEach
	public void configCheckPossibilityOfWinnerServiceFifthPossibilityTest() {
		this.fifthPossibilityTestCase = new int[9];
		this.fifthPossibilityTestCase[0] = 0;
		this.fifthPossibilityTestCase[1] = 1;
		this.fifthPossibilityTestCase[2] = 0;
		this.fifthPossibilityTestCase[3] = 1;
		this.fifthPossibilityTestCase[4] = 1;
		this.fifthPossibilityTestCase[5] = 0;
		this.fifthPossibilityTestCase[6] = 0;
		this.fifthPossibilityTestCase[7] = 1;
		this.fifthPossibilityTestCase[8] = 1;
	}
	
	@BeforeEach
	public void configCheckPossibilityOfWinnerServiceSixthPossibilityTest() {
		this.sixthPossibilityTestCase = new int[9];
		this.sixthPossibilityTestCase[0] = 0;
		this.sixthPossibilityTestCase[1] = 0;
		this.sixthPossibilityTestCase[2] = 1;
		this.sixthPossibilityTestCase[3] = 1;
		this.sixthPossibilityTestCase[4] = 0;
		this.sixthPossibilityTestCase[5] = 1;
		this.sixthPossibilityTestCase[6] = 0;
		this.sixthPossibilityTestCase[7] = 1;
		this.sixthPossibilityTestCase[8] = 1;
	}
	
	@BeforeEach
	public void configCheckPossibilityOfWinnerServiceSeventhPossibilityTest() {
		this.seventhPossibilityTestCase = new int[9];
		this.seventhPossibilityTestCase[0] = 0;
		this.seventhPossibilityTestCase[1] = 0;
		this.seventhPossibilityTestCase[2] = 1;
		this.seventhPossibilityTestCase[3] = 1;
		this.seventhPossibilityTestCase[4] = 0;
		this.seventhPossibilityTestCase[5] = 1;
		this.seventhPossibilityTestCase[6] = 1;
		this.seventhPossibilityTestCase[7] = 1;
		this.seventhPossibilityTestCase[8] = 0;
	}
	
	@BeforeEach
	public void configCheckPossibilityOfWinnerServiceEighthPossibilityTest() {
		this.eighthPossibilityTestCase = new int[9];
		this.eighthPossibilityTestCase[0] = 0;
		this.eighthPossibilityTestCase[1] = 0;
		this.eighthPossibilityTestCase[2] = 1;
		this.eighthPossibilityTestCase[3] = 0;
		this.eighthPossibilityTestCase[4] = 1;
		this.eighthPossibilityTestCase[5] = 1;
		this.eighthPossibilityTestCase[6] = 1;
		this.eighthPossibilityTestCase[7] = 0;
		this.eighthPossibilityTestCase[8] = 0;
	}
	
	@BeforeEach
	public void configCheckPossibilityOfWinnerServiceIsVelhaCase() {
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
	public void checkPossibilityOfWinnerServiceFirstPossibilityTest() {
		assertTrue(this.checkPossibilityOfWinnerServiceTest.checkAllPossibilityOfWinner(this.firstPossibilityTestCase));
	}
	
	@Test
	public void checkPossibilityOfWinnerServiceSecondPossibilityTest() {
		assertTrue(this.checkPossibilityOfWinnerServiceTest.checkAllPossibilityOfWinner(this.secondPossibilityTestCase));
	}
	
	@Test
	public void checkPossibilityOfWinnerServiceThirdPossibilityTest() {
		assertTrue(this.checkPossibilityOfWinnerServiceTest.checkAllPossibilityOfWinner(this.thirdPossibilityTestCase));
	}
	
	@Test
	public void checkPossibilityOfWinnerServiceFourthPossibilityTest() {
		assertTrue(this.checkPossibilityOfWinnerServiceTest.checkAllPossibilityOfWinner(this.fourthPossibilityTestCase));
	}
	
	@Test
	public void checkPossibilityOfWinnerServiceFifthPossibilityTest() {
		assertTrue(this.checkPossibilityOfWinnerServiceTest.checkAllPossibilityOfWinner(this.fifthPossibilityTestCase));
	}
	
	@Test
	public void checkPossibilityOfWinnerServiceSixthPossibilityTest() {
		assertTrue(this.checkPossibilityOfWinnerServiceTest.checkAllPossibilityOfWinner(this.sixthPossibilityTestCase));
	}
	
	@Test
	public void checkPossibilityOfWinnerServiceSeventhPossibilityTest() {
		assertTrue(this.checkPossibilityOfWinnerServiceTest.checkAllPossibilityOfWinner(this.seventhPossibilityTestCase));
	}
	
	@Test
	public void checkPossibilityOfWinnerServiceEighthPossibilityTest() {
		assertTrue(this.checkPossibilityOfWinnerServiceTest.checkAllPossibilityOfWinner(this.eighthPossibilityTestCase));
	}
	
	@Test
	public void checkPossibilityOfWinnerServiceIsVelhaTest() {
		assertFalse(this.checkPossibilityOfWinnerServiceTest.checkAllPossibilityOfWinner(this.isVelhaTestCase));
	}
}
