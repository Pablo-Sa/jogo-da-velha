package br.com.poc.tic.tac.toe.config.beancustomvalidators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GameInputInvalidValidator.class)
public @interface GameInputInvalid {

	String message() default "Jogo inválido, verifique suas entradas, "
							+ "somente permitido caracteres: 'X' ou 'O' e"
							+ " verifique a quantidade de cada um, deve haver 4 ou 5"
							+ " jogadas de cada Player e por fim no máximo 9 Caracteres.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String[] value() default "";

}
