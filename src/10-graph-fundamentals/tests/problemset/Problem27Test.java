import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.Test;

class Problem27Test {

	private final Problem27 sut = new Problem27();

	@Test
	void clone_cycle() {
		int[][] adj = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
		int[][] copy = sut.cloneGraph(4, adj);
		assertArrayEquals(adj, copy);
		assertNotSame(adj, copy);
		assertNotSame(adj[0], copy[0]);
	}

	@Test
	void clone_isolated() {
		assertArrayEquals(new int[][] {{}}, sut.cloneGraph(1, new int[][] {{}}));
	}

	@Test
	void clone_singleEdge() {
		assertArrayEquals(new int[][] {{1}, {0}}, sut.cloneGraph(2, new int[][] {{1}, {0}}));
	}
}
