import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem4Test {

	private final Problem4 sut = new Problem4();

	@Test
	void largest_threeChain() {
		assertEquals(3, sut.largestSetSize(6, new int[][] {{0, 1}, {1, 2}, {3, 4}}));
	}

	@Test
	void largest_noUnions_singletons() {
		assertEquals(1, sut.largestSetSize(4, new int[][] {}));
	}

	@Test
	void largest_withRedundantUnion() {
		assertEquals(3, sut.largestSetSize(5, new int[][] {{0, 1}, {2, 3}, {3, 4}, {2, 4}}));
	}
}
