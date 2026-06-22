import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem1Test {

	@Test
	void countOperations_four() {
		assertEquals(10L, new Problem1().countOperations(4));
	}

	@Test
	void countOperations_zero() {
		assertEquals(0L, new Problem1().countOperations(0));
	}
}
