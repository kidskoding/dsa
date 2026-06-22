import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem30Test {

	private final Problem30 sut = new Problem30();

	@Test
	void medianSlidingWindow_oddWindow() {
		assertArrayEquals(
				new double[] {1.0, -1.0, -1.0, 3.0, 5.0, 6.0},
				sut.medianSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3),
				1e-9);
	}

	@Test
	void medianSlidingWindow_evenWindow() {
		assertArrayEquals(
				new double[] {1.5, 2.5, 3.5}, sut.medianSlidingWindow(new int[] {1, 2, 3, 4}, 2), 1e-9);
	}

	@Test
	void medianSlidingWindow_windowOne() {
		assertArrayEquals(new double[] {5.0}, sut.medianSlidingWindow(new int[] {5}, 1), 1e-9);
	}
}
