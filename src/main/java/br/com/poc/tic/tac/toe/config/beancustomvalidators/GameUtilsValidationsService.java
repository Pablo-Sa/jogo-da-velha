package br.com.poc.tic.tac.toe.config.beancustomvalidators;

import org.springframework.stereotype.Service;

@Service
public class GameUtilsValidationsService {

	private int occurrencesOfCircle;
	private int occurrencesOfCross;
	private boolean numberOfOccurencesExceededFoundPerLine = Boolean.FALSE;
	private boolean numberOfOccurencesExceededFoundPerColumn = Boolean.FALSE;
	private boolean invalidCharacter = Boolean.FALSE;
	private static final char CIRCLE_FOUND = 'O';
	private static final char CROSS_FOUND = 'X';
	private static final int MINIMUM_QUANTITY_OF_OCCURRENCES = 4;
	private static final int MAXIMUM_NUMBER_OF_RECORDS_PER_LINE = 3;
	private static final int MAXIMUM_NUMBER_OF_RECORDS_PER_COLUMN = 3;

	public boolean validationInputPlayerCircleorCross(String[] positionsGame) {
		
		this.occurrencesOfCircle = 0;
		this.occurrencesOfCross = 0;
		this.numberOfOccurencesExceededFoundPerColumn = this.verifyNumberOfOccurencesExceededPerColumn(positionsGame.length);
		
		for (int i = 0; i < positionsGame.length; i++) {
			
			String item = positionsGame[i];
			this.numberOfOccurencesExceededFoundPerLine = this.verifyNumberOfOccurencesExceededPerLine(item);
			for (int j = 0; j < item.length(); j++) {

				if (item.charAt(j) == CIRCLE_FOUND) {
					this.occurrencesOfCircle++;
				}

				if (item.charAt(j) == CROSS_FOUND) {
					this.occurrencesOfCross++;
				}

				this.invalidCharacter = item.charAt(j) != CIRCLE_FOUND && item.charAt(j) != CROSS_FOUND ? Boolean.TRUE
						: Boolean.FALSE;
			}
		}

		if (this.occurrencesOfCircle < MINIMUM_QUANTITY_OF_OCCURRENCES 
				|| this.occurrencesOfCross < MINIMUM_QUANTITY_OF_OCCURRENCES
				|| this.invalidCharacter
				|| this.numberOfOccurencesExceededFoundPerLine
				|| this.numberOfOccurencesExceededFoundPerColumn) {
			return Boolean.FALSE;
		}

		return Boolean.TRUE;
	}
	
	public boolean verifyNumberOfOccurencesExceededPerLine(String occorences) {
		return occorences.length() > MAXIMUM_NUMBER_OF_RECORDS_PER_LINE ? Boolean.TRUE: Boolean.FALSE;
	}
	
	public boolean verifyNumberOfOccurencesExceededPerColumn(int occorences) {
		return occorences > MAXIMUM_NUMBER_OF_RECORDS_PER_COLUMN ? Boolean.TRUE: Boolean.FALSE;
	}
}
