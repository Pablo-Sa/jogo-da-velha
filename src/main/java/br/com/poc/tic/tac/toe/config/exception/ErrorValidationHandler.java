package br.com.poc.tic.tac.toe.config.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.poc.tic.tac.toe.dto.ErrorPostExceptionDto;


@RestControllerAdvice
public class ErrorValidationHandler {
	
	@Autowired
	private MessageSource messageSource;
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<ErrorPostExceptionDto> handle(MethodArgumentNotValidException exception) {
		List<ErrorPostExceptionDto> dto = new ArrayList<>();
		
		List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
		
		fieldErrors.forEach(e ->{
			String message = messageSource.getMessage(e, LocaleContextHolder.getLocale());
			ErrorPostExceptionDto error = new ErrorPostExceptionDto(e.getField(), message);
			dto.add(error);
		});

		return dto;
	}

}
	

