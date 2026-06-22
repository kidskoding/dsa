import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem17Test {

	@Test
	void distinctInRanges_countsDistinctValues() {
		var sut = new Problem17();
		int[] values = {1, 2, 1, 3, 2};
		int[][] queries = {{0, 2}, {0, 4}, {3, 4}};
		assertArrayEquals(new int[] {2, 3, 2}, sut.distinctInRanges(values, queries));
	}
}
