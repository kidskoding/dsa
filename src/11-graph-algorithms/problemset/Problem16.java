/**
 * Problem 16: Frostbite Supply Lines (bottleneck spanning tree). Return the minimum plow rating that
 * connects all depots using roads with snow depth at most that rating, or {@code -1}.
 */
class Problem16 {

	/**
	 * Returns the minimum plow rating connecting all depots, or {@code -1} if impossible.
	 *
	 * @param n the number of depots
	 * @param roads undirected roads {@code {u, v, w}} with snow depth {@code w}
	 * @return the minimax spanning-tree edge weight, or {@code -1}
	 */
	int minPlowRating(int n, int[][] roads) {
		// TODO: Kruskal: add roads by increasing depth until all depots are connected; answer is the last depth used.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
