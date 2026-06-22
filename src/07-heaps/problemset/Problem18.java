import java.util.List;

/**
 * Problem 18 — Find K Pairs with Smallest Sums.
 *
 * <p>Given two ascending-sorted arrays {@code nums1} and {@code nums2} and an integer {@code k},
 * return the {@code k} pairs {@code (u, v)} with the smallest sums (at most {@code k}, fewer if the
 * total pair count is smaller). Use a min-heap, expanding neighbors lazily.
 */
final class Problem18 {

	private Problem18() {}

	/**
	 * Returns up to {@code k} pairs with the smallest sums, each as a length-2 array.
	 *
	 * @param nums1 the first ascending-sorted array
	 * @param nums2 the second ascending-sorted array
	 * @param k how many smallest-sum pairs to return
	 * @return the smallest-sum pairs, ascending by sum
	 */
	static List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		// TODO: seed a min-heap with index pairs; pop the smallest sum and push its neighbors.
		throw new UnsupportedOperationException("TODO: implement kSmallestPairs");
	}
}
