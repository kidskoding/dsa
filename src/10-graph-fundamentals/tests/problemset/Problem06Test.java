import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem06Test {

	@Test
	void colorClasses_evenCycle_hasTwoClasses() {
		var sut = new Problem06();
		assertEquals(2, sut.colorClasses(4, new int[][] {{0, 1}, {1, 2}, {2, 3}, {3, 0}}).size());
	}

	@Test
	void colorClasses_oddCycle_isEmpty() {
		var sut = new Problem06();
		assertTrue(sut.colorClasses(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}).isEmpty());
	}
}
