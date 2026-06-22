import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	@Test
	void smallerExplodes() {
		assertArrayEquals(new int[] {5, 10}, Problem15.asteroidCollision(new int[] {5, 10, -5}));
	}

	@Test
	void equalBothExplode() {
		assertArrayEquals(new int[] {}, Problem15.asteroidCollision(new int[] {8, -8}));
	}
}
