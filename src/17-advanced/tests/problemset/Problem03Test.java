import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void rangeSumAfterUpdates_reflectsUpdates() {
		var sut = new Problem03();
		int[] initial = {1, 2, 3, 4, 5};
		int[][] updates = {{2, 10}}; // index 2 += 10 -> 13
		int[][] queries = {{1, 3}, {0, 4}};
		assertArrayEquals(new long[] {19L, 25L}, sut.rangeSumAfterUpdates(initial, updates, queries));
	}
}
