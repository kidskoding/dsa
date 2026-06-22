import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void gcd_coprime_returnsOne() {
		assertEquals(1L, new Problem05().gcd(17, 13));
	}

	@Test
	void gcd_sharedFactor_returnsGcd() {
		assertEquals(12L, new Problem05().gcd(48, 36));
	}

	@Test
	void gcd_withZero_returnsOther() {
		assertEquals(9L, new Problem05().gcd(9, 0));
	}
}
