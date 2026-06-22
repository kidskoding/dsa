import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem1Test {

	@Test
	void twoSum_basic() {
		var sut = new Problem1();
		assertArrayEquals(new int[] {0, 1}, sut.twoSum(new int[] {2, 7, 11, 15}, 9));
	}

	@Test
	void twoSum_middlePair() {
		var sut = new Problem1();
		assertArrayEquals(new int[] {1, 2}, sut.twoSum(new int[] {3, 2, 4}, 6));
	}

	@Test
	void twoSum_duplicates() {
		var sut = new Problem1();
		assertArrayEquals(new int[] {0, 1}, sut.twoSum(new int[] {3, 3}, 6));
	}
}
