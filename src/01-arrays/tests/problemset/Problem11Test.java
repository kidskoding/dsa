import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	@Test
	void visibleTowers_basic() {
		var sut = new Problem11();
		assertEquals(3, sut.visibleTowers(new int[] {3, 1, 4, 1, 5}));
	}

	@Test
	void visibleTowers_decreasing() {
		var sut = new Problem11();
		assertEquals(1, sut.visibleTowers(new int[] {5, 4, 3}));
	}

	@Test
	void visibleTowers_increasing() {
		var sut = new Problem11();
		assertEquals(4, sut.visibleTowers(new int[] {1, 2, 3, 4}));
	}
}
