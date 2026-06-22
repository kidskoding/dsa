import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem06Test {

	@Test
	void classicExample() {
		int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
		assertArrayEquals(new int[] {3, 3, 5, 5, 6, 7}, Problem06.maxSlidingWindow(nums, 3));
	}

	@Test
	void windowSizeOneIsIdentity() {
		int[] nums = {4, 2, 12, 11, -5};
		assertArrayEquals(nums, Problem06.maxSlidingWindow(nums, 1));
	}

	@Test
	void windowSpansWholeArray() {
		int[] nums = {9, 1, 7, 3};
		assertArrayEquals(new int[] {9}, Problem06.maxSlidingWindow(nums, 4));
	}
}
