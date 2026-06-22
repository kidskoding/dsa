import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void harmonic_zero_returnsZero() {
		var sut = new Problem04();
		assertEquals(0.0, sut.harmonic(0), 1e-9);
	}
}
