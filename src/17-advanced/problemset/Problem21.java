/**
 * Problem 21 — My Calendar III (LeetCode 732). After each half-open booking, report the maximum
 * number of intervals overlapping at any single point so far.
 */
class Problem21 {

	/**
	 * Processes half-open booking intervals {@code [start, end)} in order. Returns an array whose
	 * {@code i}-th entry is the maximum overlap (k-booking) over all points after the first
	 * {@code i + 1} bookings.
	 *
	 * @param bookings the half-open {@code {start, end}} bookings, in arrival order
	 * @return the running maximum overlap after each booking
	 */
	int[] maxOverlaps(int[][] bookings) {
		// TODO: sweep a difference map over event coordinates (or range-add/range-max segment tree).
		throw new UnsupportedOperationException("TODO: implement maxOverlaps");
	}
}
