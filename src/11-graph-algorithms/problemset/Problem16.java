
/**
 * Tier 3 — Problem 16: Vertex-Capacitated Max Flow.
 *
 * <p>Given per-vertex capacities in addition to edge capacities, compute the maximum flow that
 * respects both. (Hint: split each vertex {@code v} into {@code v_in -> v_out} with an edge equal
 * to the vertex capacity.)
 */
public class Problem16 {

	/**
	 * Returns the maximum {@code source}-{@code sink} flow respecting both edge and vertex
	 * capacities.
	 *
	 * @param graph a graph whose edge weights are edge capacities
	 * @param vertexCapacities {@code vertexCapacities[v]} is the maximum flow allowed through vertex
	 *		 {@code v}
	 * @param source the source vertex
	 * @param sink the sink vertex
	 * @return the maximum flow value subject to both constraints
	 * @throws IllegalArgumentException if {@code vertexCapacities.length != graph.vertexCount()}
	 */
	public double maxFlow(WeightedGraph graph, double[] vertexCapacities, int source, int sink) {
		// TODO: split each vertex into in/out nodes joined by an edge of its vertex capacity, then run
		//			 a standard max-flow algorithm on the expanded graph.
		throw new UnsupportedOperationException("TODO: implement vertex-capacitated maxFlow");
	}
}
