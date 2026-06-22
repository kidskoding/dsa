import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DivideAndConquerParadigmTest {

	@Test
	void max_unsortedArray_returnsLargest() {
		assertEquals(9, new DivideAndConquerParadigm().max(new int[] {3, 9, 1, 7, 2}));
	}

	@Test
	void max_singleElement_returnsThatElement() {
		assertEquals(42, new DivideAndConquerParadigm().max(new int[] {42}));
	}

	@Test
	void mergeSort_unsorted_returnsSorted() {
		assertArrayEquals(
				new int[] {1, 2, 3, 5, 8, 9},
				new DivideAndConquerParadigm().mergeSort(new int[] {5, 2, 9, 1, 8, 3}));
	}

	@Test
	void mergeSort_emptyArray_returnsEmpty() {
		assertArrayEquals(new int[] {}, new DivideAndConquerParadigm().mergeSort(new int[] {}));
	}

	@Test
	void mergeSort_withDuplicates_keepsAll() {
		assertArrayEquals(
				new int[] {2, 2, 4, 4, 4},
				new DivideAndConquerParadigm().mergeSort(new int[] {4, 2, 4, 2, 4}));
	}
}
