import java.util.List;

/**
 * Problem 16 — Merge k Sorted Lists.
 *
 * <p>Given {@code k} ascending-sorted integer lists, merge them into one ascending-sorted array in
 * {@code O(N log k)} time using a min-heap, where {@code N} is the total number of elements.
 */
final class Problem16 {

	private Problem16() {}

	/**
	 * Merges {@code k} ascending-sorted lists into one ascending-sorted array.
	 *
	 * @param lists the sorted input lists
	 * @return one ascending-sorted array containing every element of every list
	 */
	static int[] mergeKSorted(List<int[]> lists) {
		// TODO: seed a min-heap with the head of each list; repeatedly pop and advance that list.
		throw new UnsupportedOperationException("TODO: implement mergeKSorted");
	}
}
