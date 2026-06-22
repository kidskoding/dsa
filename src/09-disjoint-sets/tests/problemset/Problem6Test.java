import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem6Test {

	private final Problem6 sut = new Problem6();

	@Test
	void provinces_twoGroups() {
		assertEquals(2, sut.findCircleNum(new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
	}

	@Test
	void provinces_allSeparate() {
		assertEquals(3, sut.findCircleNum(new int[][] {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
	}

	@Test
	void provinces_allConnected() {
		assertEquals(1, sut.findCircleNum(new int[][] {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}));
	}
}
