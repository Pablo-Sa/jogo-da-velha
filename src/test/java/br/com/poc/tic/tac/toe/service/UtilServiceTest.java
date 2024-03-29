package br.com.poc.tic.tac.toe.service;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UtilServiceTest {

	private UtilService utilService = new UtilService();

	private static final String TEST_CASE = "XXOOOXXOX";
	private int[] positionsGameInNumberTestCase;
	private int[] positionsGameInNumberResultUtilServiceTest;

	@BeforeEach
	public void configUtilServiceTest() {
		this.positionsGameInNumberTestCase = new int[9];
		this.positionsGameInNumberResultUtilServiceTest = new int[9];
		this.positionsGameInNumberTestCase[0] = 1;
		this.positionsGameInNumberTestCase[1] = 1;
		this.positionsGameInNumberTestCase[2] = 0;
		this.positionsGameInNumberTestCase[3] = 0;
		this.positionsGameInNumberTestCase[4] = 0;
		this.positionsGameInNumberTestCase[5] = 1;
		this.positionsGameInNumberTestCase[6] = 1;
		this.positionsGameInNumberTestCase[7] = 0;
		this.positionsGameInNumberTestCase[8] = 1;
	}

	@Test
	public void utilServiceTest() {
		this.positionsGameInNumberResultUtilServiceTest = this.utilService.convertStringInCollectionNumber(TEST_CASE);
		Assert.assertArrayEquals(this.positionsGameInNumberTestCase, this.positionsGameInNumberResultUtilServiceTest);
	}
}
