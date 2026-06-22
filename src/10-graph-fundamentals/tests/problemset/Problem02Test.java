import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void countComponents_twoIslands_isTwo() {
		var sut = new Problem02();
		assertEquals(2, sut.countComponents(4, new int[][] {{0, 1}, {2, 3}}));
	}

	@Test
	void countComponents_allIsolated_equalsVertexCount() {
		var sut = new Problem02();
		assertEquals(3, sut.countComponents(3, new int[][] {}));
	}
}
