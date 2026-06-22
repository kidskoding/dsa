import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	@Test
	void maxNonOverlapping_picksBestWeightSubset() {
		var sut = new Problem15();
		int[] starts = {1, 2, 4};
		int[] ends = {3, 5, 6};
		int[] weights = {5, 6, 5};
		// [1,3] (5) + [4,6] (5) = 10 beats [2,5] (6)
		assertEquals(10L, sut.maxNonOverlapping(starts, ends, weights));
	}
}
