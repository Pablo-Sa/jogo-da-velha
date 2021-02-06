package br.com.poc.tic.tac.toe.config.beancustomvalidators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class GameInputInvalidValidatorTest {
	
	@Mock
	private GameUtilsValidationsService gameUtilsValidationsServiceTest;
	
	@InjectMocks
	private GameInputInvalidValidator gameInputInvalidValidatorTest;
	private String[] gameTestCase = new String[3]; 
	
	@BeforeEach
	public void configGameInputInvalid() {
		MockitoAnnotations.initMocks(this);
		this.gameTestCase[0] = "XXX";
		this.gameTestCase[1] = "OOX";
		this.gameTestCase[2] = "OXO";
	}
	
	@Test
	public void gameInputInvalidValidatorIsValid() {
		given(this.gameUtilsValidationsServiceTest.validationInputPlayerCircleorCross(Mockito.any()))
		.willReturn(Boolean.TRUE);

		assertTrue(this.gameInputInvalidValidatorTest.isValid(this.gameTestCase, Mockito.any()));
	}
	
	@Test
	public void gameInputInvalidValidatorIsInvalid() {
		given(this.gameUtilsValidationsServiceTest.validationInputPlayerCircleorCross(Mockito.any()))
		.willReturn(Boolean.FALSE);

		assertFalse(this.gameInputInvalidValidatorTest.isValid(this.gameTestCase, Mockito.any()));
	}

}
