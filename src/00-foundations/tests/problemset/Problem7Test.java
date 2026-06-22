import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem7Test {

	@Test
	void sumOfSubarraySums_oneTwoThree() {
		assertEquals(20L, new Problem7().sumOfSubarraySums(new int[] {1, 2, 3}));
	}

	@Test
	void sumOfSubarraySums_pair() {
		assertEquals(4L, new Problem7().sumOfSubarraySums(new int[] {1, 1}));
	}
}
