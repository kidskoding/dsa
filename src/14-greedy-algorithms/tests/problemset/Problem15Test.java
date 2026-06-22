import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem15Test {

	private final Problem15 sut = new Problem15();

	@Test
	void canPlaceFlowers_oneFits() {
		assertTrue(sut.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1));
	}

	@Test
	void canPlaceFlowers_twoDoNotFit() {
		assertFalse(sut.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 2));
	}

	@Test
	void canPlaceFlowers_twoFit() {
		assertTrue(sut.canPlaceFlowers(new int[] {0, 0, 1, 0, 0}, 2));
	}
}
