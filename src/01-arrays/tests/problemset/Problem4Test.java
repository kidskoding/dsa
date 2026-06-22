import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem4Test {

	@Test
	void merge_basic() {
		var sut = new Problem4();
		assertArrayEquals(new int[] {1, 2, 3, 4, 5}, sut.merge(new int[] {1, 3, 5}, new int[] {2, 4}));
	}

	@Test
	void merge_emptyLeft() {
		var sut = new Problem4();
		assertArrayEquals(new int[] {1, 2}, sut.merge(new int[] {}, new int[] {1, 2}));
	}

	@Test
	void merge_duplicates() {
		var sut = new Problem4();
		assertArrayEquals(new int[] {1, 1, 1, 2, 3}, sut.merge(new int[] {1, 1, 2}, new int[] {1, 3}));
	}
}
