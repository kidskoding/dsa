import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem2Test {

	@Test
	void geometricSum_ratioTwo() {
		assertEquals(15L, new Problem2().geometricSum(1, 2, 4));
	}

	@Test
	void geometricSum_ratioOne() {
		assertEquals(15L, new Problem2().geometricSum(3, 1, 5));
	}
}
