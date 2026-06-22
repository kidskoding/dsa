import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem16Test {

	@Test
	void eulerCircuit_triangle_returnsClosedTrail() {
		var sut = new Problem16();
		assertEquals(4, sut.eulerCircuit(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}).size());
	}

	@Test
	void eulerCircuit_noCircuit_isEmpty() {
		var sut = new Problem16();
		assertTrue(sut.eulerCircuit(3, new int[][] {{0, 1}, {1, 2}}).isEmpty());
	}
}
