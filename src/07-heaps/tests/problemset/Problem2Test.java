import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem2Test {

	@Test
	void isMinHeap_validHeap() {
		assertTrue(Problem2.isMinHeap(new int[] {1, 3, 2, 7, 4, 5, 6}));
	}

	@Test
	void isMinHeap_violation() {
		assertFalse(Problem2.isMinHeap(new int[] {1, 3, 2, 7, 4, 0, 6}));
	}

	@Test
	void isMinHeap_singleElement() {
		assertTrue(Problem2.isMinHeap(new int[] {5}));
	}
}
