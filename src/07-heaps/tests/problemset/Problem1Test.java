import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem1Test {

	@Test
	void siftDown_rootSinksToValidMaxHeap() {
		int[] heap = {1, 9, 8, 5, 6, 7, 4};
		Problem1.siftDown(heap, 7, 0);
		assertArrayEquals(new int[] {9, 6, 8, 5, 1, 7, 4}, heap);
	}

	@Test
	void siftDown_alreadyValidStaysPut() {
		int[] heap = {3, 1, 2};
		Problem1.siftDown(heap, 3, 0);
		assertArrayEquals(new int[] {3, 1, 2}, heap);
	}
}
