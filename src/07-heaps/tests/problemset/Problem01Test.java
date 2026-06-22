import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void heapifyDown_movesRootToCorrectPlace() {
		// Children subtrees of index 0 are already max-heaps; root 1 must sift down.
		int[] heap = {1, 9, 8, 7, 6, 5, 4};
		Problem01.heapifyDown(heap, 0, heap.length);
		assertArrayEquals(new int[] {9, 7, 8, 1, 6, 5, 4}, heap);
	}

	@Test
	void heapifyDown_noChildren_isNoOp() {
		int[] heap = {5, 3, 4};
		Problem01.heapifyDown(heap, 2, heap.length);
		assertArrayEquals(new int[] {5, 3, 4}, heap);
	}

	@Test
	void heapifyDown_respectsHeapSizeBound() {
		// Slots at and beyond index 3 are outside the heap and must be ignored.
		int[] heap = {1, 2, 3, 99};
		Problem01.heapifyDown(heap, 0, 3);
		assertArrayEquals(new int[] {3, 2, 1, 99}, heap);
	}
}
