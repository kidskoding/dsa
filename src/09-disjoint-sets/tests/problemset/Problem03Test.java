import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void findRedundantConnection_returnsLastClosingEdge() {
		var sut = new Problem03();
		assertArrayEquals(
				new int[] {1, 4},
				sut.findRedundantConnection(new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 4}}));
	}

	@Test
	void findRedundantConnection_simpleTriangle() {
		var sut = new Problem03();
		assertArrayEquals(
				new int[] {2, 3}, sut.findRedundantConnection(new int[][] {{1, 2}, {1, 3}, {2, 3}}));
	}
}
