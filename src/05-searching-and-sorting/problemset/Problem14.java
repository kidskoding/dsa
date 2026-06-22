/**
 * Problem 14 — External / k-way merge. Merge {@code k} sorted streams into one sorted output using
 * a heap, in \(O(N \log k)\) total comparisons where {@code N} is the element count.
 */
public class Problem14 {

	/**
	 * Returns a single ascending array containing every element of the given sorted arrays.
	 *
	 * @param sortedLists an array of {@code k} arrays, each sorted ascending
	 * @return the merged, ascending output of length {@code N}
	 */
	public int[] mergeKSorted(int[][] sortedLists) {
		// TODO: seed a min-heap with each list's head, then repeatedly pop and advance.
		throw new UnsupportedOperationException("TODO: implement mergeKSorted");
	}
}
