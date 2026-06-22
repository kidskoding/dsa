import java.util.List;

/** Tier 2 — Problem 17: K nearest neighbours to a query. */
public class Problem17 {

	/**
	 * Returns the indices of the {@code k} points in {@code points} nearest {@code query = [qx, qy]} by
	 * Euclidean distance, ordered nearest to farthest, ties broken by smaller index. Assumes
	 * {@code 0 <= k <= points.length}.
	 *
	 * @param points the candidate points, each as {@code [x, y]}
	 * @param query the query point {@code [qx, qy]}
	 * @param k how many nearest indices to return
	 * @return the {@code k} nearest indices, nearest first
	 */
	public List<Integer> kNearest(int[][] points, int[] query, int k) {
		// TODO: order indices by squared distance (then index) and take the first k.
		throw new UnsupportedOperationException("TODO: implement kNearest");
	}
}
