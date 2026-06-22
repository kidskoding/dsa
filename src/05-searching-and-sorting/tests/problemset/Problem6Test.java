import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem6Test {

	private final Problem6 sut = new Problem6();

	@Test
	void sortColors_mixed_returnsSorted() {
		assertArrayEquals(new int[] {0, 0, 1, 1, 2, 2}, sut.sortColors(new int[] {2, 0, 2, 1, 1, 0}));
	}

	@Test
	void sortColors_oneOfEach() {
		assertArrayEquals(new int[] {0, 1, 2}, sut.sortColors(new int[] {2, 0, 1}));
	}

	@Test
	void sortColors_single() {
		assertArrayEquals(new int[] {0}, sut.sortColors(new int[] {0}));
	}
}
