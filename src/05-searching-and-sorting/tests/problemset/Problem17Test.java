import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem17Test {

	private final Problem17 sut = new Problem17();

	@Test
	void frequencySort_basic() {
		assertArrayEquals(new int[] {3, 1, 1, 2, 2, 2}, sut.frequencySort(new int[] {1, 1, 2, 2, 2, 3}));
	}

	@Test
	void frequencySort_tieByDescendingValue() {
		assertArrayEquals(new int[] {1, 3, 3, 2, 2}, sut.frequencySort(new int[] {2, 3, 1, 3, 2}));
	}

	@Test
	void frequencySort_negatives() {
		assertArrayEquals(
				new int[] {5, -1, 4, 4, -6, -6, 1, 1, 1},
				sut.frequencySort(new int[] {-1, 1, -6, 4, 5, -6, 1, 4, 1}));
	}
}
