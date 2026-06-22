import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem9Test {

	private final Problem9 sut = new Problem9();

	@Test
	void rangeSumWithUpdates_queryUpdateQuery() {
		int[] nums = {1, 3, 5};
		int[][] ops = {{1, 0, 2}, {0, 1, 2}, {1, 0, 2}};
		assertArrayEquals(new long[] {9L, 8L}, sut.rangeSumWithUpdates(nums, ops));
	}

	@Test
	void rangeSumWithUpdates_multipleQueries() {
		int[] nums = {2, 4, 6, 8};
		int[][] ops = {{1, 1, 3}, {0, 2, 10}, {1, 0, 3}};
		assertArrayEquals(new long[] {18L, 24L}, sut.rangeSumWithUpdates(nums, ops));
	}
}
