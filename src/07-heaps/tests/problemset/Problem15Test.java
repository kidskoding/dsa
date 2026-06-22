import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	@Test
	void maxSlidingWindow_basic() {
		int[] array = {1, 3, -1, -3, 5, 3, 6, 7};
		assertArrayEquals(new int[] {3, 3, 5, 5, 6, 7}, Problem15.maxSlidingWindow(array, 3));
	}

	@Test
	void maxSlidingWindow_windowOne() {
		int[] array = {4, 2, 7};
		assertArrayEquals(new int[] {4, 2, 7}, Problem15.maxSlidingWindow(array, 1));
	}

	@Test
	void maxSlidingWindow_windowEqualsLength() {
		int[] array = {2, 5, 1, 4};
		assertArrayEquals(new int[] {5}, Problem15.maxSlidingWindow(array, 4));
	}

	@Test
	void maxSlidingWindow_withDuplicates() {
		int[] array = {5, 5, 5, 5};
		assertArrayEquals(new int[] {5, 5, 5}, Problem15.maxSlidingWindow(array, 2));
	}
}
