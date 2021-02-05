package br.com.poc.tic.tac.toe.config.beancustomvalidators;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameUtilsValidationsServiceTest {

	private GameUtilsValidationsService gameUtilsValidationsServiceTest;
	private static final char INVALID_CHARACTER_CASE = 'P';
	private static final String LIMIT_PER_LINE_TEST_CASE = "XXXX";
	private static final int LIMIT_PER_COLUMN_TEST_CASE = 5;
	private String[] gameTestCase = new String[3]; 

	@BeforeEach
	public void configEntityGame() {
		this.gameUtilsValidationsServiceTest = new GameUtilsValidationsService();
		this.gameTestCase[0] = "XXX";
		this.gameTestCase[1] = "OOX";
		this.gameTestCase[2] = "OXO";
	}

	@Test
	public void verifyInvalidCharacterTest() {
		assertTrue(this.gameUtilsValidationsServiceTest.verifyInvalidCharacter(INVALID_CHARACTER_CASE));
	}

	@Test
	public void verifyNumberOfOccurencesExceededPerLineTest() {
		assertTrue(this.gameUtilsValidationsServiceTest.verifyNumberOfOccurencesExceededPerLine(LIMIT_PER_LINE_TEST_CASE));
	}

	@Test
	public void verifyNumberOfOccurencesExceededPerColumnTest() {
		assertTrue(this.gameUtilsValidationsServiceTest.verifyNumberOfOccurencesExceededPerColumn(LIMIT_PER_COLUMN_TEST_CASE));
	}

	@Test
	public void validationInputPlayerCircleorCrossTest() {
		assertTrue(this.gameUtilsValidationsServiceTest.validationInputPlayerCircleorCross(this.gameTestCase));
	}
}
