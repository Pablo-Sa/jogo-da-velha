package br.com.poc.tic.tac.toe.service;

import org.springframework.stereotype.Service;

@Service
public class CheckPossibilityOfWinnerService {
	private int[] rules = new int[8];
	private static final int CIRCLE_WINNER = 0;
	private static final int CROSS_WINNER = 3;
	private static final int FIRST_POSSIBILITY   = 0;
	private static final int SECOND_POSSIBILITY  = 1;
	private static final int THIRD_POSSIBILITY   = 2;
	private static final int FOURTH_POSSIBILITY  = 3;
	private static final int FIFTH_POSSIBILITY   = 4;
	private static final int SIXTH_POSSIBILITY   = 5;
	private static final int SEVENTH_POSSIBILITY = 6;
	private static final int EIGHTH_POSSIBILITY  = 7;
	private boolean foundWinner = Boolean.FALSE;

	public boolean checkAllPossibilityOfWinner(int[] jogo) {
		this.rules[FIRST_POSSIBILITY]   = jogo[0] + jogo[1] + jogo[2];
		this.rules[SECOND_POSSIBILITY]  = jogo[3] + jogo[4] + jogo[5];
		this.rules[THIRD_POSSIBILITY]   = jogo[6] + jogo[7] + jogo[8];
		this.rules[FOURTH_POSSIBILITY]  = jogo[0] + jogo[3] + jogo[6];
		this.rules[FIFTH_POSSIBILITY]   = jogo[1] + jogo[4] + jogo[7];
		this.rules[SIXTH_POSSIBILITY]   = jogo[2] + jogo[5] + jogo[8];
		this.rules[SEVENTH_POSSIBILITY] = jogo[0] + jogo[4] + jogo[8];
		this.rules[EIGHTH_POSSIBILITY]  = jogo[2] + jogo[4] + jogo[6];
		
		for (int i = 0; i < rules.length; i++) {
			this.foundWinner = this.rules[i] == CIRCLE_WINNER || this.rules[i] == CROSS_WINNER ? Boolean.TRUE: Boolean.FALSE;
			
			if(this.foundWinner) {
				return this.foundWinner;
			}
		}
		
		return Boolean.FALSE;
	}
}

