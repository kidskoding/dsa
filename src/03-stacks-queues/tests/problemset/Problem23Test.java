import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem23Test {

	@Test
	void classicHistogram() {
		assertEquals(10, Problem23.largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3}));
	}

	@Test
	void flatBars() {
		assertEquals(4, Problem23.largestRectangleArea(new int[] {1, 1, 1, 1}));
	}
}
