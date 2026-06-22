/** Shared helpers for problem-set tests in this module. */
final class ProblemTestSupport {

	private ProblemTestSupport() {}

	/** Returns whether {@code array} is sorted in ascending order. */
	static boolean isAscending(int[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i]) {
				return false;
			}
		}
		return true;
	}

	/** Returns whether {@code array} satisfies the min-heap property over its full length. */
	static boolean isMinHeap(int[] array) {
		for (int child = 1; child < array.length; child++) {
			if (array[(child - 1) / 2] > array[child]) {
				return false;
			}
		}
		return true;
	}
}
