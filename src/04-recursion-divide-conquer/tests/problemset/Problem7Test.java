import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem7Test {

	private final Problem7 sut = new Problem7();

	@Test
	void myPow_positiveExponent() {
		assertEquals(1024.0, sut.myPow(2.0, 10), 1e-5);
	}

	@Test
	void myPow_fractionalBase() {
		assertEquals(9.261, sut.myPow(2.1, 3), 1e-5);
	}

	@Test
	void myPow_negativeExponent() {
		assertEquals(0.25, sut.myPow(2.0, -2), 1e-5);
	}
}
