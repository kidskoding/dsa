import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void degrees_path_countsIncidentEdges() {
		var sut = new Problem01();
		assertArrayEquals(new int[] {1, 2, 1}, sut.degrees(3, new int[][] {{0, 1}, {1, 2}}));
	}

	@Test
	void degrees_noEdges_allZero() {
		var sut = new Problem01();
		assertArrayEquals(new int[] {0, 0}, sut.degrees(2, new int[][] {}));
	}
}
