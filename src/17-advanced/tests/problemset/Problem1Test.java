import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem1Test {

	private final Problem1 sut = new Problem1();

	@Test
	void rangeSums_basic() {
		int[] nums = {1, 2, 3, 4, 5};
		int[][] q = {{0, 2}, {1, 3}, {0, 4}};
		assertArrayEquals(new long[] {6L, 9L, 15L}, sut.rangeSums(nums, q));
	}

	@Test
	void rangeSums_singleElement() {
		int[] nums = {7};
		int[][] q = {{0, 0}};
		assertArrayEquals(new long[] {7L}, sut.rangeSums(nums, q));
	}
}
