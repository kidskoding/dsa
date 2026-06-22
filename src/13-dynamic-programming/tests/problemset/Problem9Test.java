import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem9Test {

	private final Problem9 p = new Problem9();

	@Test
	void fourCombinations() {
		assertEquals(4, p.change(5, new int[] {1, 2, 5}));
	}

	@Test
	void noCombination() {
		assertEquals(0, p.change(3, new int[] {2}));
	}

	@Test
	void singleExactCoin() {
		assertEquals(1, p.change(10, new int[] {10}));
	}
}
