package br.com.poc.tic.tac.toe.service;

import org.springframework.stereotype.Service;

@Service
public class CheckPossibilityOfWinnerService {
	private static final int CIRCLE_WINNER = 0;
	private static final int CROSS_WINNER = 1;
	private boolean existsWinner = Boolean.FALSE;
	private int existsWinnerCounterAuxiliary = 0;

	public boolean checkAllPossibilityOfWinner(int[] jogo) {
		this.checkFirstPossibilityOfWinner(jogo);
		this.checkSecondPossibilityOfWinner(jogo);
		this.checkThirdPossibilityOfWinner(jogo);
		this.checkFourthPossibilityOfWinner(jogo);
		this.checkFifthPossibilityOfWinner(jogo);
		this.checkSixthPossibilityOfWinner(jogo);
		this.checkSeventhPossibilityOfWinner(jogo);
		this.checkEighthPossibilityOfWinner(jogo);
		return existsWinner;
	}

	public boolean checkFirstPossibilityOfWinner(int[] jogo) {
		this.existsWinnerCounterAuxiliary = jogo[0] + jogo[1] + jogo[2];
		this.existsWinner = this.existsWinnerCounterAuxiliary == CIRCLE_WINNER 
				|| this.existsWinnerCounterAuxiliary == CROSS_WINNER ? Boolean.TRUE : Boolean.FALSE;
		return this.existsWinner;
	}

	public boolean checkSecondPossibilityOfWinner(int[] jogo) {
		this.existsWinnerCounterAuxiliary = jogo[3] + jogo[4] + jogo[5];
		this.existsWinner = this.existsWinnerCounterAuxiliary == CIRCLE_WINNER
				|| this.existsWinnerCounterAuxiliary == CROSS_WINNER ? Boolean.TRUE : Boolean.FALSE;
		return this.existsWinner;
	}

	public boolean checkThirdPossibilityOfWinner(int[] jogo) {
		this.existsWinnerCounterAuxiliary = jogo[6] + jogo[7] + jogo[8];
		this.existsWinner = this.existsWinnerCounterAuxiliary == CIRCLE_WINNER
				|| this.existsWinnerCounterAuxiliary == CROSS_WINNER ? Boolean.TRUE : Boolean.FALSE;
		return this.existsWinner;
	}

	public boolean checkFourthPossibilityOfWinner(int[] jogo) {
		this.existsWinnerCounterAuxiliary = jogo[0] + jogo[3] + jogo[6];
		this.existsWinner = this.existsWinnerCounterAuxiliary == CIRCLE_WINNER
				|| this.existsWinnerCounterAuxiliary == CROSS_WINNER ? Boolean.TRUE : Boolean.FALSE;
		return this.existsWinner;
	}

	public boolean checkFifthPossibilityOfWinner(int[] jogo) {
		this.existsWinnerCounterAuxiliary = jogo[1] + jogo[4] + jogo[7];
		this.existsWinner = this.existsWinnerCounterAuxiliary == CIRCLE_WINNER
				|| this.existsWinnerCounterAuxiliary == CROSS_WINNER ? Boolean.TRUE : Boolean.FALSE;
		return this.existsWinner;
	}

	public boolean checkSixthPossibilityOfWinner(int[] jogo) {
		this.existsWinnerCounterAuxiliary = jogo[2] + jogo[5] + jogo[8];
		this.existsWinner = this.existsWinnerCounterAuxiliary == CIRCLE_WINNER
				|| this.existsWinnerCounterAuxiliary == CROSS_WINNER ? Boolean.TRUE : Boolean.FALSE;
		return this.existsWinner;
	}

	public boolean checkSeventhPossibilityOfWinner(int[] jogo) {
		this.existsWinnerCounterAuxiliary = jogo[0] + jogo[4] + jogo[8];
		this.existsWinner = this.existsWinnerCounterAuxiliary == CIRCLE_WINNER
				|| this.existsWinnerCounterAuxiliary == CROSS_WINNER ? Boolean.TRUE : Boolean.FALSE;
		return this.existsWinner;
	}

	public boolean checkEighthPossibilityOfWinner(int[] jogo) {
		this.existsWinnerCounterAuxiliary = jogo[2] + jogo[4] + jogo[6];
		this.existsWinner = this.existsWinnerCounterAuxiliary == CIRCLE_WINNER
				|| this.existsWinnerCounterAuxiliary == CROSS_WINNER ? Boolean.TRUE : Boolean.FALSE;
		return this.existsWinner;
	}

}
