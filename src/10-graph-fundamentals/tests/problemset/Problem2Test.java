import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem2Test {

	private final Problem2 sut = new Problem2();

	@Test
	void components_twoGroups() {
		assertEquals(2, sut.countComponents(5, new int[][] {{0, 1}, {1, 2}, {3, 4}}));
	}

	@Test
	void components_allIsolated() {
		assertEquals(4, sut.countComponents(4, new int[][] {}));
	}

	@Test
	void components_trianglePairAndLoner() {
		assertEquals(3, sut.countComponents(6, new int[][] {{0, 1}, {1, 2}, {2, 0}, {3, 4}}));
	}
}
