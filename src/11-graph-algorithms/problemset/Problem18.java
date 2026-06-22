/**
 * Problem 18: Galactic Courier (layered Dijkstra). Return the minimum fuel from {@code src} to
 * {@code dst}, allowing at most one boosted lane to be halved, or {@code -1}.
 */
class Problem18 {

	/**
	 * Returns the minimum fuel from {@code src} to {@code dst} using at most one boost, or {@code -1}.
	 *
	 * @param n the number of stations
	 * @param lanes undirected lanes {@code {u, v, w}}
	 * @param boosted whether each lane can be halved
	 * @param src the source station
	 * @param dst the destination station
	 * @return the minimum fuel, or {@code -1} if unreachable
	 */
	long minFuel(int n, int[][] lanes, boolean[] boosted, int src, int dst) {
		// TODO: Dijkstra over states (station, boostUsed); a boosted lane may be taken at w/2 once.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
