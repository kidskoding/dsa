import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem29Test {

	private final Problem29 sut = new Problem29();

	@Test
	void safe_someCycle() {
		int[][] graph = {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
		assertArrayEquals(new int[] {2, 4, 5, 6}, sut.eventualSafeNodes(graph));
	}

	@Test
	void safe_acyclicAll() {
		int[][] graph = {{}, {0, 2, 3, 4}, {3}, {4}, {}};
		assertArrayEquals(new int[] {0, 1, 2, 3, 4}, sut.eventualSafeNodes(graph));
	}

	@Test
	void safe_pureCycle() {
		int[][] graph = {{1}, {2}, {0}};
		assertArrayEquals(new int[] {}, sut.eventualSafeNodes(graph));
	}
}
