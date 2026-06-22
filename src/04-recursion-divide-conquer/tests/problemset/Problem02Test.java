import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void power_positiveExponent_returnsValue() {
		assertEquals(243L, new Problem02().power(3, 5));
	}

	@Test
	void power_zeroExponent_returnsOne() {
		assertEquals(1L, new Problem02().power(10, 0));
	}
}
