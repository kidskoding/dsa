import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem8Test {

	private final Problem8 sut = new Problem8();

	@Test
	void nearest() {
		assertEquals(2, sut.nearest(new int[][] {{0, 0}, {5, 5}, {1, 1}}, new int[] {2, 2}));
	}

	@Test
	void tieByIndex() {
		assertEquals(0, sut.nearest(new int[][] {{3, 4}, {3, 4}}, new int[] {0, 0}));
	}

	@Test
	void onPoint() {
		assertEquals(0, sut.nearest(new int[][] {{10, 10}}, new int[] {10, 10}));
	}
}
