import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem05Test {

	private final Problem05 p = new Problem05();

	@Test
	void feasibleSubset() {
		assertTrue(p.canSum(new int[] {3, 34, 4, 12, 5, 2}, 9));
	}

	@Test
	void infeasibleSubset() {
		assertFalse(p.canSum(new int[] {3, 34, 4, 12, 5, 2}, 30));
	}

	@Test
	void zeroTargetAlwaysFeasible() {
		assertTrue(p.canSum(new int[] {1, 2, 3}, 0));
	}

	@Test
	void emptySetCannotReachPositive() {
		assertFalse(p.canSum(new int[0], 5));
	}
}
