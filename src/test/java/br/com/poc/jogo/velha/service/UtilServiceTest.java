package br.com.poc.jogo.velha.service;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.poc.tic.tac.toe.service.UtilService;

public class UtilServiceTest {

	@Test
	void contextLoads() {

	}

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
	public void entityGameTestSucess() {
		this.positionsGameInNumberResultUtilServiceTest = this.utilService.convertStringInCollectionNumber(TEST_CASE);
		Assert.assertArrayEquals(this.positionsGameInNumberTestCase, this.positionsGameInNumberResultUtilServiceTest);
	}
}
