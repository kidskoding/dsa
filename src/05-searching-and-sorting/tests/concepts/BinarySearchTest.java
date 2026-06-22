import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	private final BinarySearch sut = new BinarySearch();

	@Test
	void search_presentValue_returnsAMatchingIndex() {
		int[] a = {1, 3, 5, 7, 9};
		int idx = sut.search(a, 7);
		assertEquals(7, a[idx]);
	}

	@Test
	void search_absentValue_returnsMinusOne() {
		assertEquals(-1, sut.search(new int[] {1, 3, 5, 7, 9}, 4));
	}

	@Test
	void search_emptyArray_returnsMinusOne() {
		assertEquals(-1, sut.search(new int[] {}, 1));
	}

	@Test
	void search_singleElementMatch_returnsZero() {
		assertEquals(0, sut.search(new int[] {42}, 42));
	}

	@Test
	void search_singleElementMiss_returnsMinusOne() {
		assertEquals(-1, sut.search(new int[] {42}, 7));
	}

	@Test
	void search_firstElement_isFound() {
		int[] a = {2, 4, 6, 8};
		int idx = sut.search(a, 2);
		assertEquals(2, a[idx]);
	}

	@Test
	void search_lastElement_isFound() {
		int[] a = {2, 4, 6, 8};
		int idx = sut.search(a, 8);
		assertEquals(8, a[idx]);
	}

	@Test
	void search_duplicates_returnsAMatchingIndex() {
		int[] a = {1, 2, 2, 2, 3};
		int idx = sut.search(a, 2);
		assertEquals(2, a[idx]);
	}

	@Test
	void search_largeSortedArray_findsValue() {
		int n = 100_000;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = 2 * i;
		}
		int idx = sut.search(a, 123_456);
		assertTrue(idx >= 0);
		assertEquals(123_456, a[idx]);
	}
}
