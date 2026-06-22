import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void classicExample() {
		assertEquals(10, Problem12.largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3}));
	}

	@Test
	void twoBars() {
		assertEquals(4, Problem12.largestRectangleArea(new int[] {2, 4}));
	}

	@Test
	void singleBar() {
		assertEquals(5, Problem12.largestRectangleArea(new int[] {5}));
	}

	@Test
	void uniformHeights() {
		assertEquals(12, Problem12.largestRectangleArea(new int[] {3, 3, 3, 3}));
	}
}
