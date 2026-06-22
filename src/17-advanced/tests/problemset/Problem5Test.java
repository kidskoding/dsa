import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem5Test {

	private final Problem5 sut = new Problem5();

	@Test
	void countInversions_mixed() {
		assertEquals(3L, sut.countInversions(new int[] {2, 4, 1, 3, 5}));
	}

	@Test
	void countInversions_sortedHasNone() {
		assertEquals(0L, sut.countInversions(new int[] {1, 2, 3, 4}));
	}

	@Test
	void countInversions_descending() {
		assertEquals(10L, sut.countInversions(new int[] {5, 4, 3, 2, 1}));
	}
}
