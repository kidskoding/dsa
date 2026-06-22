import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void reachableWithin_oneLevel_includesNeighbors() {
		var sut = new Problem03();
		assertEquals(
				List.of(0, 1, 2), sut.reachableWithin(4, new int[][] {{0, 1}, {0, 2}, {2, 3}}, 0, 1));
	}

	@Test
	void reachableWithin_zeroLevels_onlySource() {
		var sut = new Problem03();
		assertEquals(List.of(0), sut.reachableWithin(3, new int[][] {{0, 1}, {1, 2}}, 0, 0));
	}
}
