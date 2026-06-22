import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void minStabbingPoints_overlappingChain_sharesPoints() {
		var sut = new Problem02();
		int[][] intervals = {{1, 3}, {2, 5}, {4, 6}};
		assertEquals(2, sut.minStabbingPoints(intervals));
	}

	@Test
	void minStabbingPoints_disjointIntervals_needOnePerInterval() {
		var sut = new Problem02();
		int[][] intervals = {{1, 2}, {3, 4}, {5, 6}};
		assertEquals(3, sut.minStabbingPoints(intervals));
	}
}
