import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	private final Problem14 sut = new Problem14();

	@Test
	void mergeKSorted_threeLists_mergesSorted() {
		int[][] lists = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, sut.mergeKSorted(lists));
	}

	@Test
	void mergeKSorted_unevenLists_mergesSorted() {
		int[][] lists = {{1}, {2, 3, 4, 5}, {}};
		assertArrayEquals(new int[] {1, 2, 3, 4, 5}, sut.mergeKSorted(lists));
	}

	@Test
	void mergeKSorted_singleList_returnsIt() {
		int[][] lists = {{1, 2, 3}};
		assertArrayEquals(new int[] {1, 2, 3}, sut.mergeKSorted(lists));
	}

	@Test
	void mergeKSorted_allEmpty_returnsEmpty() {
		int[][] lists = {{}, {}};
		assertArrayEquals(new int[] {}, sut.mergeKSorted(lists));
	}
}
