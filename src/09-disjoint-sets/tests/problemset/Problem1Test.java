import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem1Test {

	private final Problem1 sut = new Problem1();

	@Test
	void countComponents_twoGroups() {
		assertEquals(2, sut.countComponents(5, new int[][] {{0, 1}, {1, 2}, {3, 4}}));
	}

	@Test
	void countComponents_singleChain() {
		assertEquals(1, sut.countComponents(5, new int[][] {{0, 1}, {1, 2}, {2, 3}, {3, 4}}));
	}

	@Test
	void countComponents_noEdges_allSingletons() {
		assertEquals(4, sut.countComponents(4, new int[][] {}));
	}
}
