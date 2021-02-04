package br.com.poc.tic.tac.toe.service;

import org.springframework.stereotype.Service;

@Service
public class CheckPossibilityOfWinnerService {
	private int[] rules = new int[8];
	private static final int CIRCLE_WINNER = 0;
	private static final int CROSS_WINNER = 3;
	private static final int firstPossibility   = 0;
	private static final int secondPossibility  = 1;
	private static final int thirdPossibility   = 2;
	private static final int fourthPossibility  = 3;
	private static final int fifthPossibility   = 4;
	private static final int sixthPossibility   = 5;
	private static final int seventhPossibility = 6;
	private static final int eighthPossibility  = 7;
	private boolean foundWinner = Boolean.FALSE;

	public boolean checkAllPossibilityOfWinner(int[] jogo) {
		this.rules[firstPossibility]   = jogo[0] + jogo[1] + jogo[2];
		this.rules[secondPossibility]  = jogo[3] + jogo[4] + jogo[5];
		this.rules[thirdPossibility]   = jogo[6] + jogo[7] + jogo[8];
		this.rules[fourthPossibility]  = jogo[0] + jogo[3] + jogo[6];
		this.rules[fifthPossibility]   = jogo[1] + jogo[4] + jogo[7];
		this.rules[sixthPossibility]   = jogo[2] + jogo[5] + jogo[8];
		this.rules[seventhPossibility] = jogo[0] + jogo[4] + jogo[8];
		this.rules[eighthPossibility]  = jogo[2] + jogo[4] + jogo[6];
		
		for (int i = 0; i < rules.length; i++) {
			this.foundWinner = this.rules[i] == CIRCLE_WINNER || this.rules[i] == CROSS_WINNER ? Boolean.TRUE: Boolean.FALSE;
			
			if(this.foundWinner) {
				return this.foundWinner;
			}
		}
		
		return Boolean.FALSE;
	}
}
