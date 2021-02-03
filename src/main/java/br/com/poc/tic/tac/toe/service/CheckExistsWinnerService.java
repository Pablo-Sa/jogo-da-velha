package br.com.poc.tic.tac.toe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckExistsWinnerService {

	@Autowired
	private CheckPossibilityOfWinnerService possibilityOfWinnerService;
	
	public boolean isVelha(int[] jogo) {
		return this.possibilityOfWinnerService.checkAllPossibilityOfWinner(jogo);
	}
	
}
