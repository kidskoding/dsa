/**
 * Problem 24: Vertex-Capacitated Max Flow (vertex splitting). Return the maximum flow respecting both
 * edge capacities and per-vertex throughput limits.
 */
class Problem24 {

	/**
	 * Returns the maximum flow from {@code source} to {@code sink} respecting vertex capacities.
	 *
	 * @param n the number of vertices
	 * @param edges directed edges {@code {u, v, c}}
	 * @param vertexCap the per-vertex throughput limit (source and sink uncapacitated)
	 * @param source the source vertex
	 * @param sink the sink vertex
	 * @return the maximum flow
	 */
	int maxFlow(int n, int[][] edges, int[] vertexCap, int source, int sink) {
		// TODO: split each vertex v into v_in->v_out with capacity vertexCap[v]; run max flow on the expanded graph.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
