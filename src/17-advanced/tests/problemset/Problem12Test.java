import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	private final Problem12 sut = new Problem12();

	@Test
	void countRangeSum_basic() {
		assertEquals(3L, sut.countRangeSum(new int[] {-2, 5, -1}, -2L, 2L));
	}

	@Test
	void countRangeSum_singleZero() {
		assertEquals(1L, sut.countRangeSum(new int[] {0}, 0L, 0L));
	}

	@Test
	void countRangeSum_positive() {
		assertEquals(3L, sut.countRangeSum(new int[] {1, 2, 3}, 3L, 5L));
	}
}
