import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	@Test
	void mapsSubset() {
		assertArrayEquals(
				new int[] {-1, 3, -1},
				Problem11.nextGreaterElement(new int[] {4, 1, 2}, new int[] {1, 3, 4, 2}));
	}

	@Test
	void smallExample() {
		assertArrayEquals(
				new int[] {3, -1},
				Problem11.nextGreaterElement(new int[] {2, 4}, new int[] {1, 2, 3, 4}));
	}
}
