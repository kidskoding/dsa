/**
 * Problem 28: Number Of Ways To Arrive At Destination. Return the number of distinct shortest-time
 * paths from intersection 0 to {@code n-1}, modulo {@code 1_000_000_007}.
 */
class Problem28 {

	/**
	 * Returns the count of shortest-time paths from 0 to {@code n-1}, modulo {@code 1e9 + 7}.
	 *
	 * @param n the number of intersections
	 * @param roads bidirectional roads {@code {u, v, time}}
	 * @return the number of distinct shortest paths modulo {@code 1_000_000_007}
	 */
	int countPaths(int n, int[][] roads) {
		// TODO: Dijkstra tracking shortest distances and path counts; reset count on a strictly shorter route, add on an equal one (mod 1e9+7).
		throw new UnsupportedOperationException("TODO: implement");
	}
}
