import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem19Test {

	@Test
	void medianSlidingWindow_oddWindow() {
		double[] expected = {1.0, -1.0, -1.0, 3.0, 5.0, 6.0};
		assertArrayEquals(
				expected, Problem19.medianSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3), 1e-9);
	}

	@Test
	void medianSlidingWindow_evenWindow() {
		double[] expected = {1.5, 2.5, 3.5};
		assertArrayEquals(expected, Problem19.medianSlidingWindow(new int[] {1, 2, 3, 4}, 2), 1e-9);
	}
}
