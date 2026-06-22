/** Problem 12 — Contains Duplicate II. See {@code PROBLEM_SET.md}. */
class Problem12 {

	/**
	 * Returns whether there exist indices {@code i, j} with {@code nums[i] == nums[j]} and
	 * {@code |i - j| <= k}. Track the last index seen per value in a hash map.
	 *
	 * @param nums the input array, non-null
	 * @param k the maximum allowed index gap
	 * @return {@code true} if a close-enough duplicate exists
	 */
	boolean containsNearbyDuplicate(int[] nums, int k) {
		// TODO: store value->lastIndex; on a repeat, return true if index gap is at most k.
		throw new UnsupportedOperationException("TODO: implement containsNearbyDuplicate");
	}
}
