package br.com.poc.tic.tac.toe.dto.erros;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorPostExceptionDto {
	
	private String field;
	private String error;

}