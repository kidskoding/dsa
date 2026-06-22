import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem29Test {

	private final Problem29 p = new Problem29();

	@Test
	void twoMatrices() {
		assertEquals(6000L, p.minScalarMultiplications(new int[] {10, 20, 30}));
	}

	@Test
	void fourMatrices() {
		assertEquals(26000L, p.minScalarMultiplications(new int[] {40, 20, 30, 10, 30}));
	}

	@Test
	void singleMatrix() {
		assertEquals(0L, p.minScalarMultiplications(new int[] {10, 20}));
	}
}
