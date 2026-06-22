/**
 * Problem 22: Aqueduct Throughput (maximum flow). Return the maximum sustained throughput from
 * {@code source} to {@code sink} over directed capacitated pipes.
 */
class Problem22 {

	/**
	 * Returns the maximum flow from {@code source} to {@code sink}.
	 *
	 * @param n the number of junctions
	 * @param pipes directed pipes {@code {u, v, c}} with capacity {@code c}
	 * @param source the source junction
	 * @param sink the sink junction
	 * @return the maximum throughput
	 */
	int maxThroughput(int n, int[][] pipes, int source, int sink) {
		// TODO: build a residual network and run Edmonds-Karp: BFS for augmenting paths, push bottlenecks until none remain.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
