import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem10Test {

	@Test
	void logFactorial_two() {
		assertEquals(1.0, new Problem10().logFactorial(2), 1e-9);
	}

	@Test
	void logFactorial_four() {
		assertEquals(4.584962500721156, new Problem10().logFactorial(4), 1e-9);
	}
}
