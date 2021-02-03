package br.com.poc.tic.tac.toe.service;

import org.springframework.stereotype.Service;

@Service
public class UtilService {
	
	private static final int CIRCLE = 0;
	private static final int CROSS = 1;
	private static final char isCROSS = 'X'; 
	private int[] positionsGameInNumber = new int[9];

	public int[] convertStringInCollectionNumber(String positionsGame) {
		
		for (int i = 0; i < positionsGame.length(); i++) {
			positionsGameInNumber[i] = positionsGame.charAt(i) == isCROSS ? CROSS: CIRCLE;
		}
		return positionsGameInNumber;
	}
}
