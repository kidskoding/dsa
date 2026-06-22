import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void wrapsAround() {
		assertArrayEquals(new int[] {2, -1, 2}, Problem13.nextGreaterElements(new int[] {1, 2, 1}));
	}

	@Test
	void decreasing() {
		assertArrayEquals(
				new int[] {-1, 5, 5, 5, 5},
				Problem13.nextGreaterElements(new int[] {5, 4, 3, 2, 1}));
	}
}
