import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class Problem6Test {

	private final Problem6 sut = new Problem6();

	@Test
	void coloring_evenCycle() {
		int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 0}};
		int[] color = sut.twoColoring(4, edges);
		assertEquals(4, color.length);
		for (int[] e : edges) {
			assertNotEquals(color[e[0]], color[e[1]]);
		}
	}

	@Test
	void coloring_oddCycleEmpty() {
		assertArrayEquals(new int[] {}, sut.twoColoring(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}));
	}

	@Test
	void coloring_isolatedDefaultsZero() {
		assertArrayEquals(new int[] {0, 1, 0}, sut.twoColoring(3, new int[][] {{0, 1}}));
	}
}
