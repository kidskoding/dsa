import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UniversalHashingTest {

	@Test
	void hash_inRange() {
		var sut = new UniversalHashing(101, 10, 7, 3);
		for (long k = 0; k < 50; k++) {
			int h = sut.hash(k);
			assertTrue(h >= 0 && h < 10, "hash out of range for key " + k);
		}
	}

	@Test
	void collisionProbability_atMostOneOverM() {
		int m = 10;
		var sut = new UniversalHashing(101, m, 7, 3);
		double prob = sut.collisionProbability(4, 27);
		assertTrue(prob <= 1.0 / m + 1e-9, "universal bound 1/m violated: " + prob);
	}

	@Test
	void collisionProbability_isNonNegative() {
		var sut = new UniversalHashing(101, 10, 1, 0);
		assertTrue(sut.collisionProbability(2, 99) >= 0.0);
	}
}
