import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	@Test
	void select_smallestRank_returnsMinimum() {
		assertEquals(1, new Problem16().select(new int[] {5, 3, 1, 4, 2}, 1));
	}

	@Test
	void select_middleRank_returnsMedian() {
		assertEquals(3, new Problem16().select(new int[] {5, 3, 1, 4, 2}, 3));
	}

	@Test
	void select_largestRank_returnsMaximum() {
		assertEquals(5, new Problem16().select(new int[] {5, 3, 1, 4, 2}, 5));
	}
}
