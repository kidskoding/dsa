import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem3Test {

	private final Problem3 sut = new Problem3();

	@Test
	void rangeMinimums_basic() {
		int[] nums = {2, 5, 1, 4, 9, 3};
		int[][] q = {{0, 2}, {3, 5}, {0, 5}};
		assertArrayEquals(new int[] {1, 3, 1}, sut.rangeMinimums(nums, q));
	}

	@Test
	void rangeMinimums_negatives() {
		int[] nums = {-3, 0, -7, 5};
		int[][] q = {{1, 3}, {0, 3}};
		assertArrayEquals(new int[] {-7, -7}, sut.rangeMinimums(nums, q));
	}
}
