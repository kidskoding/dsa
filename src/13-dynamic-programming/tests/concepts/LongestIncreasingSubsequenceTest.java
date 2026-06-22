import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestIncreasingSubsequenceTest {

	private final LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();

	@Test
	void classicInstance() {
		int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
		assertEquals(4, lis.length(nums));
		assertEquals(4, lis.lengthFast(nums));
	}

	@Test
	void strictlyIncreasing() {
		int[] nums = {1, 2, 3, 4, 5};
		assertEquals(5, lis.length(nums));
		assertEquals(5, lis.lengthFast(nums));
	}

	@Test
	void strictlyDecreasing() {
		int[] nums = {5, 4, 3, 2, 1};
		assertEquals(1, lis.length(nums));
		assertEquals(1, lis.lengthFast(nums));
	}

	@Test
	void duplicatesAreNotStrictlyIncreasing() {
		int[] nums = {2, 2, 2, 2};
		assertEquals(1, lis.length(nums));
		assertEquals(1, lis.lengthFast(nums));
	}

	@Test
	void singleElement() {
		assertEquals(1, lis.length(new int[] {42}));
		assertEquals(1, lis.lengthFast(new int[] {42}));
	}

	@Test
	void emptyArray() {
		assertEquals(0, lis.length(new int[0]));
		assertEquals(0, lis.lengthFast(new int[0]));
	}
}
