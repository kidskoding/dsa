import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DagShortestPathsTest {

	private static Graph chain() {
		return Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}}, true);
	}

	private static int[][] unitWeights() {
		int[][] w = new int[3][3];
		w[0][1] = 1;
		w[1][2] = 1;
		return w;
	}

	@Test
	void shortestDistances_chain_accumulate() {
		int[] d = DagShortestPaths.shortestDistances(chain(), unitWeights(), 0);
		assertEquals(0, d[0]);
		assertEquals(1, d[1]);
		assertEquals(2, d[2]);
	}

	@Test
	void shortestDistances_unreachable_isMaxValue() {
		var g = Representations.fromEdgeList(2, new int[][] {}, true);
		int[] d = DagShortestPaths.shortestDistances(g, new int[2][2], 0);
		assertEquals(Integer.MAX_VALUE, d[1]);
	}

	@Test
	void shortestDistances_sourceIsZero() {
		int[] d = DagShortestPaths.shortestDistances(chain(), unitWeights(), 0);
		assertEquals(0, d[0]);
	}

	@Test
	void longestDistances_chain_accumulate() {
		int[] d = DagShortestPaths.longestDistances(chain(), unitWeights(), 0);
		assertEquals(2, d[2]);
	}

	@Test
	void longestDistances_unreachable_isMinValue() {
		var g = Representations.fromEdgeList(2, new int[][] {}, true);
		int[] d = DagShortestPaths.longestDistances(g, new int[2][2], 0);
		assertEquals(Integer.MIN_VALUE, d[1]);
	}
}
