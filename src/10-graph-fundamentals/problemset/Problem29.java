/** Applied — Problem 29: Find eventual safe states. */
class Problem29 {

	/**
	 * Returns, in ascending order, every node from which all paths eventually reach a terminal
	 * node — i.e. nodes that cannot reach a cycle.
	 *
	 * @param graph adjacency list where {@code graph[u]} lists out-neighbors of {@code u}
	 * @return the safe nodes, ascending
	 */
	int[] eventualSafeNodes(int[][] graph) {
		// TODO: cycle-aware DFS coloring, or topological peel on the reversed graph.
		throw new UnsupportedOperationException("TODO: implement eventualSafeNodes");
	}
}
