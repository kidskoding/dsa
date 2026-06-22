import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void merge_twoSorted_producesSorted() {
		var sut = new Problem04();
		assertArrayEquals(
				new int[] {1, 2, 3, 4, 5, 6}, sut.merge(new int[] {1, 3, 5}, new int[] {2, 4, 6}));
	}

	@Test
	void merge_oneEmpty_returnsOther() {
		var sut = new Problem04();
		assertArrayEquals(new int[] {1, 2}, sut.merge(new int[] {}, new int[] {1, 2}));
	}
}
