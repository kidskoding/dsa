import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem10Test {

	private final Problem10 sut = new Problem10();

	@Test
	void rangeMinWithUpdates_queryUpdateQuery() {
		int[] nums = {3, 7, 2, 9, 4};
		int[][] ops = {{1, 0, 2}, {0, 1, 1}, {1, 0, 2}};
		assertArrayEquals(new int[] {2, 1}, sut.rangeMinWithUpdates(nums, ops));
	}

	@Test
	void rangeMinWithUpdates_simpleQuery() {
		int[] nums = {5, 4, 6};
		int[][] ops = {{1, 0, 2}};
		assertArrayEquals(new int[] {4}, sut.rangeMinWithUpdates(nums, ops));
	}
}
