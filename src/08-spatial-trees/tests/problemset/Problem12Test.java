import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem12Test {

	private final Problem12 sut = new Problem12();

	@Test
	void overlapping() {
		assertTrue(sut.isOverlap(new int[] {0, 0, 2, 2}, new int[] {1, 1, 3, 3}));
	}

	@Test
	void touchingEdge() {
		assertFalse(sut.isOverlap(new int[] {0, 0, 1, 1}, new int[] {1, 0, 2, 1}));
	}

	@Test
	void disjoint() {
		assertFalse(sut.isOverlap(new int[] {0, 0, 1, 1}, new int[] {2, 2, 3, 3}));
	}
}
