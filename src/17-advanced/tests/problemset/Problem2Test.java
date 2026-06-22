import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem2Test {

	private final Problem2 sut = new Problem2();

	@Test
	void prefixSumsAfterOps_updateThenPrefix() {
		int[] nums = {1, 2, 3, 4};
		int[][] ops = {{1, 3}, {0, 1, 10}, {1, 3}};
		assertArrayEquals(new long[] {10L, 20L}, sut.prefixSumsAfterOps(nums, ops));
	}

	@Test
	void prefixSumsAfterOps_multiplePrefixes() {
		int[] nums = {5, 5, 5};
		int[][] ops = {{1, 0}, {1, 2}};
		assertArrayEquals(new long[] {5L, 15L}, sut.prefixSumsAfterOps(nums, ops));
	}
}
