import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FastExponentiationTest {

	@Test
	void power_positiveExponent_returnsValue() {
		assertEquals(1024L, new FastExponentiation().power(2, 10));
	}

	@Test
	void power_zeroExponent_returnsOne() {
		assertEquals(1L, new FastExponentiation().power(7, 0));
	}

	@Test
	void modPower_largeExponent_returnsModularResult() {
		// 3^200 mod 1000 == 1 (3 has order dividing 100 modulo 1000).
		assertEquals(1L, new FastExponentiation().modPower(3, 200, 1000));
	}

	@Test
	void modPower_simpleCase_returnsRemainder() {
		assertEquals(4L, new FastExponentiation().modPower(2, 10, 5));
	}
}
