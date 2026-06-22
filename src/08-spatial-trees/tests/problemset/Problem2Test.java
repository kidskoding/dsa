import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem2Test {

	private final Problem2 sut = new Problem2();

	@Test
	void inside() {
		assertTrue(sut.contains(new int[] {0, 0, 4, 4}, new int[] {2, 2}));
	}

	@Test
	void onEdge() {
		assertTrue(sut.contains(new int[] {0, 0, 4, 4}, new int[] {4, 1}));
	}

	@Test
	void outside() {
		assertFalse(sut.contains(new int[] {0, 0, 4, 4}, new int[] {5, 2}));
	}
}
