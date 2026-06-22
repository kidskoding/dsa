import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem18Test {

	private final Problem18 p = new Problem18();

	@Test
	void splittable() {
		assertTrue(p.canPartition(new int[] {1, 5, 11, 5}));
	}

	@Test
	void oddTotal() {
		assertFalse(p.canPartition(new int[] {1, 2, 3, 5}));
	}

	@Test
	void simplePair() {
		assertTrue(p.canPartition(new int[] {2, 2}));
	}
}
