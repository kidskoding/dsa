import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem05Test {

	private final Problem05 sut = new Problem05();

	@Test
	void merge_interleavedArrays_mergesSorted() {
		assertArrayEquals(
				new int[] {1, 2, 3, 4, 5, 6}, sut.merge(new int[] {1, 3, 5}, new int[] {2, 4, 6}));
	}

	@Test
	void merge_withDuplicates_keepsAll() {
		assertArrayEquals(new int[] {1, 2, 2, 3, 3}, sut.merge(new int[] {2, 3}, new int[] {1, 2, 3}));
	}

	@Test
	void merge_oneEmpty_returnsOther() {
		assertArrayEquals(new int[] {1, 2, 3}, sut.merge(new int[] {}, new int[] {1, 2, 3}));
	}

	@Test
	void merge_bothEmpty_returnsEmpty() {
		assertArrayEquals(new int[] {}, sut.merge(new int[] {}, new int[] {}));
	}
}
