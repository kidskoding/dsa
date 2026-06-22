import java.util.List;

/** Tier 3 — Problem 14: Condensation (DAG of strongly connected components). */
public class Problem14 {

	/** The condensation of a directed graph: a component id per vertex plus inter-component edges. */
	public static final class Condensation {
		/** Component id in {@code 0..k-1} for each vertex, indexed by vertex. */
		public final int[] componentId;

		/** Edges between distinct components, as {@code [ci, cj]} pairs, without duplicates. */
		public final List<int[]> edges;

		/**
		 * Creates a condensation result.
		 *
		 * @param componentId the component id per vertex
		 * @param edges the inter-component edges
		 */
		public Condensation(int[] componentId, List<int[]> edges) {
			this.componentId = componentId;
			this.edges = edges;
		}
	}

	/**
	 * Builds the condensation of a directed graph: assigns each vertex its SCC id and returns the set
	 * of edges between distinct components.
	 *
	 * @param vertexCount the number of vertices
	 * @param edges the directed edges as {@code [u, v]} pairs meaning {@code u -> v}
	 * @return the condensation (component ids plus inter-component edge set)
	 */
	public Condensation condense(int vertexCount, int[][] edges) {
		// TODO: compute SCC ids, then collect distinct edges between different components.
		throw new UnsupportedOperationException("TODO: implement condense");
	}
}
