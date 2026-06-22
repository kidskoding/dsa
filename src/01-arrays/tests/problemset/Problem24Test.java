import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem24Test {

	@Test
	void maxWindowSum_basic() {
		var sut = new Problem24();
		assertEquals(51, sut.maxWindowSum(new int[] {1, 12, -5, -6, 50, 3}, 4));
	}

	@Test
	void maxWindowSum_windowOne() {
		var sut = new Problem24();
		assertEquals(5, sut.maxWindowSum(new int[] {5, 5, 5}, 1));
	}

	@Test
	void maxWindowSum_allNegative() {
		var sut = new Problem24();
		assertEquals(-3, sut.maxWindowSum(new int[] {-1, -2, -3, -4}, 2));
	}
}
