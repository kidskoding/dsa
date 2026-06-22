import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem17Test {

	private final Problem17 sut = new Problem17();

	@Test
	void mst_squareWithDiagonal() {
		assertEquals(
			6L, sut.minimumSpanningTree(4, new int[][] {{0, 1, 1}, {1, 2, 2}, {2, 3, 3}, {0, 3, 4}}));
	}

	@Test
	void mst_disconnected_minusOne() {
		assertEquals(-1L, sut.minimumSpanningTree(3, new int[][] {{0, 1, 5}}));
	}

	@Test
	void mst_singleNode_zero() {
		assertEquals(0L, sut.minimumSpanningTree(1, new int[][] {}));
	}
}
