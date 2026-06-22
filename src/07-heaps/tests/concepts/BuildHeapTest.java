import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BuildHeapTest {

	@Test
	void buildMaxHeap_producesValidMaxHeap() {
		int[] array = {3, 1, 6, 5, 2, 4};
		BuildHeap.buildMaxHeap(array);
		assertTrue(BuildHeap.isMaxHeap(array));
	}

	@Test
	void buildMaxHeap_emptyArray_isTrivialHeap() {
		int[] array = {};
		BuildHeap.buildMaxHeap(array);
		assertTrue(BuildHeap.isMaxHeap(array));
	}

	@Test
	void buildMaxHeap_singleElement_isHeap() {
		int[] array = {7};
		BuildHeap.buildMaxHeap(array);
		assertTrue(BuildHeap.isMaxHeap(array));
	}

	@Test
	void buildMaxHeap_withDuplicates_isHeap() {
		int[] array = {4, 4, 4, 4, 4};
		BuildHeap.buildMaxHeap(array);
		assertTrue(BuildHeap.isMaxHeap(array));
	}

	@Test
	void isMaxHeap_recognizesValidHeap() {
		int[] array = {9, 7, 8, 1, 2, 3};
		assertTrue(BuildHeap.isMaxHeap(array));
	}

	@Test
	void isMaxHeap_recognizesInvalidHeap() {
		int[] array = {1, 9, 8, 2, 3};
		assertFalse(BuildHeap.isMaxHeap(array));
	}

	@Test
	void siftDown_fixesViolationAtRoot() {
		int[] array = {0, 9, 8, 7, 6, 5, 4};
		BuildHeap.siftDown(array, 0, array.length);
		assertTrue(BuildHeap.isMaxHeap(array));
	}

	@Test
	void buildMaxHeap_largeReverseSortedInput_isHeap() {
		int[] array = new int[1000];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		BuildHeap.buildMaxHeap(array);
		assertTrue(BuildHeap.isMaxHeap(array));
	}
}
