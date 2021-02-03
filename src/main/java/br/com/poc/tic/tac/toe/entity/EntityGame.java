package br.com.poc.tic.tac.toe.entity;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EntityGame {

	@NotEmpty
	@NotNull
	private List<String> jogo = new ArrayList<String>(3);
}

