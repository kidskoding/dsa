import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void nearbyDuplicate_withinK() {
		var sut = new Problem12();
		assertTrue(sut.containsNearbyDuplicate(new int[] {1, 2, 3, 1}, 3));
	}

	@Test
	void nearbyDuplicate_adjacent() {
		var sut = new Problem12();
		assertTrue(sut.containsNearbyDuplicate(new int[] {1, 0, 1, 1}, 1));
	}

	@Test
	void nearbyDuplicate_tooFar() {
		var sut = new Problem12();
		assertFalse(sut.containsNearbyDuplicate(new int[] {1, 2, 3, 1, 2, 3}, 2));
	}
}
