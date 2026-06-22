import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void countInversions_reversed_returnsMaxPairs() {
		assertEquals(6L, new Problem14().countInversions(new int[] {4, 3, 2, 1}));
	}

	@Test
	void countInversions_sorted_returnsZero() {
		assertEquals(0L, new Problem14().countInversions(new int[] {1, 2, 3, 4}));
	}
}
