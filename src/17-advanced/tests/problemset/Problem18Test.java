import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem18Test {

	private final Problem18 sut = new Problem18();

	@Test
	void rangeSumsAfterRangeUpdates_basic() {
		int[][] ops = {{0, 0, 2, 3}, {0, 1, 4, 2}, {1, 0, 4, 0}};
		assertArrayEquals(new long[] {19L}, sut.rangeSumsAfterRangeUpdates(5, ops));
	}

	@Test
	void rangeSumsAfterRangeUpdates_partial() {
		int[][] ops = {{0, 0, 2, 4}, {1, 1, 2, 0}};
		assertArrayEquals(new long[] {8L}, sut.rangeSumsAfterRangeUpdates(3, ops));
	}
}
