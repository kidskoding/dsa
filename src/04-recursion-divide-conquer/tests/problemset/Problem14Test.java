import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	private final Problem14 sut = new Problem14();

	@Test
	void sortArray_distinct() {
		assertArrayEquals(new int[] {1, 2, 3, 5}, sut.sortArray(new int[] {5, 2, 3, 1}));
	}

	@Test
	void sortArray_duplicates() {
		assertArrayEquals(
				new int[] {0, 0, 1, 1, 2, 5}, sut.sortArray(new int[] {5, 1, 1, 2, 0, 0}));
	}

	@Test
	void sortArray_singleton() {
		assertArrayEquals(new int[] {42}, sut.sortArray(new int[] {42}));
	}
}
