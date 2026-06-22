/**
 * Problem 10 — Kth Largest Element in a Stream.
 *
 * <p>Given {@code k} and an initial array, support {@code add(val)} returning the {@code k}-th
 * largest element in the stream after inserting {@code val}. Maintain a size-{@code k} min-heap so
 * each {@code add} runs in {@code O(log k)}.
 */
final class Problem10 {

	/**
	 * Creates a tracker for the {@code k}-th largest element, seeded with {@code initial}.
	 *
	 * @param k the rank to track
	 * @param initial the initial stream values
	 */
	Problem10(int k, int[] initial) {
		// TODO: store k and seed a size-k min-heap from the initial values.
		throw new UnsupportedOperationException("TODO: implement constructor");
	}

	/**
	 * Inserts {@code val} and returns the current {@code k}-th largest element.
	 *
	 * @param val the value to add
	 * @return the {@code k}-th largest element after insertion
	 */
	int add(int val) {
		// TODO: push val, keep the heap size at k, and return its root.
		throw new UnsupportedOperationException("TODO: implement add");
	}
}
