import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	@Test
	void maxSlidingWindow_windowThree_returnsPerWindowMax() {
		var sut = new Problem15();
		assertArrayEquals(
				new int[] {3, 3, 5, 5, 6, 7},
				sut.maxSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3));
	}

	@Test
	void maxSlidingWindow_windowEqualsLength_returnsGlobalMax() {
		var sut = new Problem15();
		assertArrayEquals(new int[] {9}, sut.maxSlidingWindow(new int[] {4, 9, 2}, 3));
	}
}
