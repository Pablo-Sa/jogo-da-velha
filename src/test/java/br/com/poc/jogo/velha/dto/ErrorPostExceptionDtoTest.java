package br.com.poc.jogo.velha.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.poc.tic.tac.toe.dto.ErrorPostExceptionDto;

public class ErrorPostExceptionDtoTest {
	
	@Test
	void contextLoads() {

	}
	
	private ErrorPostExceptionDto errorPostExceptionDtoTest;
	private static final String FIELD_CASE = "Jogo";
	private static final String ERROR_CASE = "Jogo Inválido";
	
	@BeforeEach
	public void configErrorPostExceptionDtoTest() {
		this.errorPostExceptionDtoTest = new ErrorPostExceptionDto(FIELD_CASE, ERROR_CASE);
	}
	
	@Test
	public void errorPostExceptionDtoTestSucess() {
		assertEquals(this.errorPostExceptionDtoTest.getField(), FIELD_CASE);
		assertEquals(this.errorPostExceptionDtoTest.getError(), ERROR_CASE);
	}
}
