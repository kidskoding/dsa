import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem7Test {

	private final Problem7 sut = new Problem7();

	@Test
	void sumRanges_basic() {
		int[] nums = {-2, 0, 3, -5, 2, -1};
		int[][] q = {{0, 2}, {2, 5}, {0, 5}};
		assertArrayEquals(new int[] {1, -1, -3}, sut.sumRanges(nums, q));
	}

	@Test
	void sumRanges_singleAndFull() {
		int[] nums = {1, 2, 3};
		int[][] q = {{0, 0}, {0, 2}};
		assertArrayEquals(new int[] {1, 6}, sut.sumRanges(nums, q));
	}
}
