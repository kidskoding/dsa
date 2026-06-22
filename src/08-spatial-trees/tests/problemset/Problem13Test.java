import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	private final Problem13 sut = new Problem13();

	@Test
	void nearest() {
		assertEquals(0, sut.nearestManhattan(new int[][] {{1, 1}, {4, 4}, {0, 3}}, new int[] {0, 0}));
	}

	@Test
	void tieByIndex() {
		assertEquals(0, sut.nearestManhattan(new int[][] {{2, 0}, {0, 2}}, new int[] {0, 0}));
	}

	@Test
	void onPoint() {
		assertEquals(0, sut.nearestManhattan(new int[][] {{5, 5}}, new int[] {5, 5}));
	}
}
