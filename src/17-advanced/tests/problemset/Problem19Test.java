import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem19Test {

	private final Problem19 sut = new Problem19();

	@Test
	void coverageCounts_basic() {
		int[][] ops = {{0, 1, 5}, {0, 3, 8}, {1, 4, 0}, {1, 7, 0}};
		assertArrayEquals(new int[] {2, 1}, sut.coverageCounts(ops));
	}

	@Test
	void coverageCounts_endpointsInclusive() {
		int[][] ops = {{0, 0, 10}, {1, 0, 0}, {1, 10, 0}, {1, 11, 0}};
		assertArrayEquals(new int[] {1, 1, 0}, sut.coverageCounts(ops));
	}
}
