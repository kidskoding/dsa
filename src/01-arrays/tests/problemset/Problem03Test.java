import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void twoSum_pairExists_returnsIndices() {
		var sut = new Problem03();
		assertArrayEquals(new int[] {0, 3}, sut.twoSum(new int[] {1, 3, 4, 6}, 7));
	}

	@Test
	void twoSum_noPair_returnsNegativeOnes() {
		var sut = new Problem03();
		assertArrayEquals(new int[] {-1, -1}, sut.twoSum(new int[] {1, 2, 3}, 100));
	}
}
