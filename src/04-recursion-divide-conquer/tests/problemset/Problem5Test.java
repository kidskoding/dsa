import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem5Test {

	private final Problem5 sut = new Problem5();

	@Test
	void gcd_commonFactor() {
		assertEquals(6L, sut.gcd(48, 18));
	}

	@Test
	void gcd_coprime() {
		assertEquals(1L, sut.gcd(17, 5));
	}

	@Test
	void gcd_zeroLeft() {
		assertEquals(9L, sut.gcd(0, 9));
	}
}
