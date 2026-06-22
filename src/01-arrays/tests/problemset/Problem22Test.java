import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem22Test {

	@Test
	void subarraySum_basic() {
		var sut = new Problem22();
		assertEquals(2, sut.subarraySum(new int[] {1, 1, 1}, 2));
	}

	@Test
	void subarraySum_distinct() {
		var sut = new Problem22();
		assertEquals(2, sut.subarraySum(new int[] {1, 2, 3}, 3));
	}

	@Test
	void subarraySum_zeroTarget() {
		var sut = new Problem22();
		assertEquals(3, sut.subarraySum(new int[] {1, -1, 0}, 0));
	}
}
