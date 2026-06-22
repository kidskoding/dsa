import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem6Test {

	@Test
	void slidingMax() {
		assertArrayEquals(
				new int[] {3, 3, 5, 5, 6, 7},
				Problem6.maxSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3));
	}

	@Test
	void singleWindow() {
		assertArrayEquals(new int[] {1}, Problem6.maxSlidingWindow(new int[] {1}, 1));
	}
}
