import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem17Test {

	@Test
	void tribonacci_four() {
		assertEquals(4L, new Problem17().tribonacci(4));
	}

	@Test
	void tribonacci_ten() {
		assertEquals(149L, new Problem17().tribonacci(10));
	}
}
