import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void countComponents_twoGroups() {
		var sut = new Problem01();
		assertEquals(2, sut.countComponents(5, new int[][] {{0, 1}, {1, 2}, {3, 4}}));
	}

	@Test
	void countComponents_noEdges_allSingletons() {
		var sut = new Problem01();
		assertEquals(4, sut.countComponents(4, new int[][] {}));
	}
}
