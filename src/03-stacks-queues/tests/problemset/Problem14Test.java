import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void classicExample() {
		int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
		assertArrayEquals(new int[] {-1, -3, -3, -3, 3, 3}, Problem14.minSlidingWindow(nums, 3));
	}

	@Test
	void windowSizeOneIsIdentity() {
		int[] nums = {4, 2, 12, 11, -5};
		assertArrayEquals(nums, Problem14.minSlidingWindow(nums, 1));
	}

	@Test
	void windowSpansWholeArray() {
		int[] nums = {9, 1, 7, 3};
		assertArrayEquals(new int[] {1}, Problem14.minSlidingWindow(nums, 4));
	}
}
