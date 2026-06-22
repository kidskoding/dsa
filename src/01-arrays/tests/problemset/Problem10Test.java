import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem10Test {

	@Test
	void maxArea_basic() {
		var sut = new Problem10();
		assertEquals(49, sut.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
	}

	@Test
	void maxArea_twoLines() {
		var sut = new Problem10();
		assertEquals(1, sut.maxArea(new int[] {1, 1}));
	}

	@Test
	void maxArea_symmetric() {
		var sut = new Problem10();
		assertEquals(16, sut.maxArea(new int[] {4, 3, 2, 1, 4}));
	}
}
