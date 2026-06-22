import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void bridges_path_everyEdgeIsBridge() {
		var sut = new Problem13();
		assertEquals(2, sut.bridges(3, new int[][] {{0, 1}, {1, 2}}).size());
	}

	@Test
	void bridges_cycle_none() {
		var sut = new Problem13();
		assertTrue(sut.bridges(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}).isEmpty());
	}
}
