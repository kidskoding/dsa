import java.util.List;

/**
 * Hamiltonian paths and cycles of the shared {@link Graph}: visiting every vertex exactly once,
 * decided with a bitmask dynamic program over vertex subsets. Implement each method from first
 * principles — see the workbook page {@code hamiltonian-paths.md} for definitions and invariants.
 */
final class HamiltonianPaths {

	private HamiltonianPaths() {}

	/**
	 * Returns whether the graph has a Hamiltonian path (a path visiting every vertex exactly once).
	 *
	 * @param graph the graph to inspect
	 * @return {@code true} if some Hamiltonian path exists
	 */
	public static boolean hasHamiltonianPath(Graph graph) {
		// TODO: Held–Karp style DP over (subset, last) reachability states.
		throw new UnsupportedOperationException("TODO: implement hasHamiltonianPath");
	}

	/**
	 * Returns whether the graph has a Hamiltonian cycle (a cycle visiting every vertex exactly once).
	 *
	 * @param graph the graph to inspect
	 * @return {@code true} if some Hamiltonian cycle exists
	 */
	public static boolean hasHamiltonianCycle(Graph graph) {
		// TODO: DP over subsets, requiring the final vertex to connect back to the start.
		throw new UnsupportedOperationException("TODO: implement hasHamiltonianCycle");
	}

	/**
	 * Returns the vertex sequence of a Hamiltonian path, or an empty list if none exists.
	 *
	 * @param graph the graph to inspect
	 * @return a Hamiltonian path as a vertex sequence, or empty if none exists
	 */
	public static List<Integer> findHamiltonianPath(Graph graph) {
		// TODO: run the bitmask DP while storing parent pointers, then reconstruct.
		throw new UnsupportedOperationException("TODO: implement findHamiltonianPath");
	}
}
