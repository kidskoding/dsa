import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem3Test {

	@Test
	void twoSum_basic() {
		var sut = new Problem3();
		assertArrayEquals(new int[] {0, 1}, sut.twoSum(new int[] {2, 7, 11, 15}, 9));
	}

	@Test
	void twoSum_endpoints() {
		var sut = new Problem3();
		assertArrayEquals(new int[] {0, 2}, sut.twoSum(new int[] {2, 3, 4}, 6));
	}

	@Test
	void twoSum_none() {
		var sut = new Problem3();
		assertArrayEquals(new int[] {-1, -1}, sut.twoSum(new int[] {1, 2, 3}, 100));
	}
}
