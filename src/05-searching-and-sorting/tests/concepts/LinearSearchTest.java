import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LinearSearchTest {

	private final LinearSearch sut = new LinearSearch();

	@Test
	void search_presentValue_returnsItsIndex() {
		assertEquals(2, sut.search(new int[] {9, 4, 7, 1}, 7));
	}

	@Test
	void search_absentValue_returnsMinusOne() {
		assertEquals(-1, sut.search(new int[] {9, 4, 7, 1}, 5));
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
	void search_duplicates_returnsFirstIndex() {
		assertEquals(1, sut.search(new int[] {3, 8, 8, 8}, 8));
	}

	@Test
	void search_firstElement_returnsZero() {
		assertEquals(0, sut.search(new int[] {5, 6, 7}, 5));
	}

	@Test
	void search_lastElement_returnsLastIndex() {
		int[] a = {5, 6, 7};
		assertEquals(a.length - 1, sut.search(a, 7));
	}

	@Test
	void search_largeArray_findsValue() {
		int n = 10_000;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i;
		}
		int idx = sut.search(a, 9_876);
		assertTrue(idx >= 0);
		assertEquals(9_876, a[idx]);
	}
}
