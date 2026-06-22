import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem23Test {

	private final Problem23 sut = new Problem23();

	@Test
	void twoDisjointRoutes() {
		int[][] r = {{0, 1, 3}, {1, 3, 3}, {0, 2, 2}, {2, 3, 2}};
		assertEquals(5, sut.minCutCapacity(4, r, 0, 3));
	}

	@Test
	void seriesCut() {
		int[][] r = {{0, 1, 4}, {1, 2, 4}};
		assertEquals(4, sut.minCutCapacity(3, r, 0, 2));
	}

	@Test
	void alreadyDisconnected() {
		int[][] r = {{0, 1, 5}};
		assertEquals(0, sut.minCutCapacity(4, r, 0, 3));
	}
}
