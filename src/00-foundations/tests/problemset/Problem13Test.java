import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void solutionExponent_mergeSort_returnsOne() {
		var sut = new Problem13();
		assertEquals(1.0, sut.solutionExponent(2, 2, 1.0), 1e-9);
	}

	@Test
	void hasLogFactor_balancedCase_returnsTrue() {
		var sut = new Problem13();
		assertTrue(sut.hasLogFactor(2, 2, 1.0));
	}
}
