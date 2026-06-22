/**
 * Problem 8 — K Closest Points to Origin.
 *
 * <p>Given 2-D points {@code points[i] = [xi, yi]} and an integer {@code k}, return the {@code k}
 * points closest to the origin by Euclidean distance, in any order. Compare squared distances and
 * use a size-{@code k} max-heap.
 */
final class Problem8 {

	private Problem8() {}

	/**
	 * Returns the {@code k} points closest to the origin, in any order.
	 *
	 * @param points the candidate points, each a length-2 array
	 * @param k how many closest points to return
	 * @return the {@code k} closest points
	 */
	static int[][] kClosest(int[][] points, int k) {
		// TODO: keep a size-k max-heap keyed on squared distance, evicting the farthest.
		throw new UnsupportedOperationException("TODO: implement kClosest");
	}
}
