/** Problem 18: Bridge Building Budget. */
public class Problem18 {

	/**
	 * Given {@code n} islands labelled {@code 0..n-1} and candidate {@code bridges} (each
	 * {@code [u, v, cost]}), returns the total cost to connect every island, or {@code -1} if it is
	 * impossible. Bridges are considered in ascending cost; a bridge is built only if its endpoints
	 * are not already connected (Kruskal's algorithm).
	 *
	 * @param n the number of islands, n &ge; 1
	 * @param bridges the candidate bridges, each {@code [u, v, cost]}
	 * @return the total connecting cost, or -1 if the islands cannot all be connected
	 */
	long bridgeBudget(int n, int[][] bridges) {
		// TODO: sort bridges by cost, union to skip redundant ones, sum costs; -1 if disconnected.
		throw new UnsupportedOperationException("TODO: implement bridgeBudget");
	}
}
