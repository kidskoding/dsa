import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MatrixChainMultiplicationTest {

	private final MatrixChainMultiplication mcm = new MatrixChainMultiplication();

	@Test
	void classicInstance() {
		// Matrices 40x20, 20x30, 30x10, 10x30 -> optimal cost 26000.
		int[] dims = {40, 20, 30, 10, 30};
		assertEquals(26000, mcm.minMultiplications(dims));
	}

	@Test
	void threeMatrices() {
		// 10x30, 30x5, 5x60 -> optimal cost 4500.
		int[] dims = {10, 30, 5, 60};
		assertEquals(4500, mcm.minMultiplications(dims));
	}

	@Test
	void twoMatricesHaveSingleCost() {
		int[] dims = {10, 20, 30};
		assertEquals(6000, mcm.minMultiplications(dims));
	}

	@Test
	void singleMatrixHasNoCost() {
		int[] dims = {10, 20};
		assertEquals(0, mcm.minMultiplications(dims));
	}

	@Test
	void emptyChainHasNoCost() {
		int[] dims = {10};
		assertEquals(0, mcm.minMultiplications(dims));
	}
}
