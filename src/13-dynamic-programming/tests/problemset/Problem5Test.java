import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem5Test {

	private final Problem5 p = new Problem5();

	@Test
	void reachableTarget() {
		assertTrue(p.canSum(new int[] {3, 34, 4, 12, 5, 2}, 9));
	}

	@Test
	void unreachableTarget() {
		assertFalse(p.canSum(new int[] {3, 34, 4, 12, 5, 2}, 30));
	}

	@Test
	void zeroIsReachable() {
		assertTrue(p.canSum(new int[] {1, 2, 3}, 0));
	}
}
