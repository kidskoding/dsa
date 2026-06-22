/**
 * Problem 11: Cheapest Flights Within K Stops (hop-bounded Bellman-Ford). Return the cheapest price
 * from {@code src} to {@code dst} using at most {@code k} stops, or {@code -1}.
 */
class Problem11 {

	/**
	 * Returns the cheapest price within {@code k} stops, or {@code -1} if unreachable.
	 *
	 * @param n the number of cities
	 * @param flights directed edges {@code {from, to, price}}
	 * @param src the source city
	 * @param dst the destination city
	 * @param k the maximum number of intermediate stops
	 * @return the cheapest price, or {@code -1}
	 */
	int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
		// TODO: relax all edges k+1 rounds over a snapshot of the previous round's distances.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
