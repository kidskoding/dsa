import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem02Test {

	private final Problem02 sut = new Problem02();

	@Test
	void countInversions_reverseSorted_isMaximal() {
		// n*(n-1)/2 = 4*3/2 = 6
		assertEquals(6L, sut.countInversions(new int[] {4, 3, 2, 1}));
	}

	@Test
	void countInversions_sorted_isZero() {
		assertEquals(0L, sut.countInversions(new int[] {1, 2, 3, 4}));
	}

	@Test
	void countInversions_mixed_countsPairs() {
		assertEquals(3L, sut.countInversions(new int[] {2, 4, 1, 3, 5}));
	}

	@Test
	void countInversions_empty_isZero() {
		assertEquals(0L, sut.countInversions(new int[] {}));
	}
}
