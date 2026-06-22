import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void anyIntervalContains_detectsContainingInterval() {
		var sut = new Problem02();
		int[] lows = {1, 10, 20};
		int[] highs = {5, 15, 25};
		assertTrue(sut.anyIntervalContains(lows, highs, 12));
		assertFalse(sut.anyIntervalContains(lows, highs, 8));
	}
}
