import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem17Test {

	private final Problem17 sut = new Problem17();

	@Test
	void pointValuesAfterRangeUpdates_basic() {
		int[][] ops = {{0, 1, 3, 2}, {1, 2, 0, 0}, {1, 4, 0, 0}};
		assertArrayEquals(new long[] {2L, 0L}, sut.pointValuesAfterRangeUpdates(5, ops));
	}

	@Test
	void pointValuesAfterRangeUpdates_overlap() {
		int[][] ops = {{0, 0, 2, 5}, {0, 1, 1, 3}, {1, 1, 0, 0}};
		assertArrayEquals(new long[] {8L}, sut.pointValuesAfterRangeUpdates(3, ops));
	}
}
