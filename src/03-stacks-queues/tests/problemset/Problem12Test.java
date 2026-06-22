import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void waitCounts() {
		assertArrayEquals(
				new int[] {1, 1, 4, 2, 1, 1, 0, 0},
				Problem12.dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73}));
	}

	@Test
	void strictlyIncreasing() {
		assertArrayEquals(
				new int[] {1, 1, 1, 0}, Problem12.dailyTemperatures(new int[] {30, 40, 50, 60}));
	}
}
