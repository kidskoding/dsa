import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem5Test {

	@Test
	void sumOfSquares_three() {
		assertEquals(14L, new Problem5().sumOfSquares(3));
	}

	@Test
	void sumOfSquares_five() {
		assertEquals(55L, new Problem5().sumOfSquares(5));
	}
}
