import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void maxNonOverlapping_keepsLargestCompatibleSet() {
		var sut = new Problem03();
		int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
		assertEquals(3, sut.maxNonOverlapping(intervals));
	}

	@Test
	void maxNonOverlapping_singleInterval_returnsOne() {
		var sut = new Problem03();
		assertEquals(1, sut.maxNonOverlapping(new int[][] {{0, 10}}));
	}
}
