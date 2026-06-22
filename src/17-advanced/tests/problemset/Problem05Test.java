import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void rangeAddRangeSum_appliesRangeUpdates() {
		var sut = new Problem05();
		int[] initial = {0, 0, 0, 0, 0};
		int[][] updates = {{1, 3, 5}}; // add 5 to indices 1..3
		int[][] queries = {{0, 4}, {1, 2}};
		assertArrayEquals(new long[] {15L, 10L}, sut.rangeAddRangeSum(initial, updates, queries));
	}
}
