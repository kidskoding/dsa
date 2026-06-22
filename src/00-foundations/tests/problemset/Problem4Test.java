import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem4Test {

	@Test
	void harmonic_zero() {
		assertEquals(0.0, new Problem4().harmonic(0), 1e-9);
	}

	@Test
	void harmonic_four() {
		assertEquals(25.0 / 12.0, new Problem4().harmonic(4), 1e-9);
	}
}
