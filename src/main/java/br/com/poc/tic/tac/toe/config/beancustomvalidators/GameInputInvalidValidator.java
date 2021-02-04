package br.com.poc.tic.tac.toe.config.beancustomvalidators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

public class GameInputInvalidValidator implements ConstraintValidator<GameInputInvalid, String[]> {

	private String[] value;
	
	@Autowired
	private GameUtilsValidationsService gameUtilService; 
	
	@Override
	public boolean isValid(String []value, ConstraintValidatorContext constraintValidatorContext) {
		return gameUtilService.validationInputPlayerCircleorCross(value);
	}
}
