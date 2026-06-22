import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	private final Problem16 sut = new Problem16();

	@Test
	void stabbingCounts_basic() {
		int[][] intervals = {{1, 5}, {2, 6}, {4, 8}};
		int[] points = {3, 7, 1};
		assertArrayEquals(new int[] {2, 1, 1}, sut.stabbingCounts(intervals, points));
	}

	@Test
	void stabbingCounts_endpointsInclusive() {
		int[][] intervals = {{0, 0}};
		int[] points = {0, 1};
		assertArrayEquals(new int[] {1, 0}, sut.stabbingCounts(intervals, points));
	}
}
