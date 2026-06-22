import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void isMinHeap_validHeap_returnsTrue() {
		assertTrue(Problem02.isMinHeap(new int[] {1, 3, 2, 7, 8, 5, 4}));
	}

	@Test
	void isMinHeap_invalidHeap_returnsFalse() {
		assertFalse(Problem02.isMinHeap(new int[] {1, 3, 2, 0, 8}));
	}

	@Test
	void isMinHeap_emptyAndSingle_areTrivialHeaps() {
		assertTrue(Problem02.isMinHeap(new int[] {}));
		assertTrue(Problem02.isMinHeap(new int[] {42}));
	}

	@Test
	void isMinHeap_allDuplicates_returnsTrue() {
		assertTrue(Problem02.isMinHeap(new int[] {5, 5, 5, 5}));
	}
}
