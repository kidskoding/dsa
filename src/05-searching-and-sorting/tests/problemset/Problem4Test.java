import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem4Test {

	private final Problem4 sut = new Problem4();

	@Test
	void merge_interleaved_returnsSorted() {
		assertArrayEquals(new int[] {1, 2, 2, 3, 5, 6}, sut.merge(new int[] {1, 2, 3}, new int[] {2, 5, 6}));
	}

	@Test
	void merge_oneEmpty_returnsOther() {
		assertArrayEquals(new int[] {1}, sut.merge(new int[] {}, new int[] {1}));
	}

	@Test
	void merge_duplicatesAcross_keepsAll() {
		assertArrayEquals(new int[] {1, 4, 4, 4}, sut.merge(new int[] {4, 4}, new int[] {1, 4}));
	}
}
