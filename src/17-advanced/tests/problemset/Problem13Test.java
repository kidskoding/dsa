import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void queryVersion_answersHistoricalQueries() {
		var sut = new Problem13();
		int[] initial = {1, 2, 3}; // version 0
		int[][] updates = {{1, 10}}; // version 1: [1, 10, 3]
		int[][] queries = {{0, 0, 2}, {1, 0, 2}}; // {version, lo, hi}
		assertArrayEquals(new long[] {6L, 14L}, sut.queryVersion(initial, updates, queries));
	}
}
