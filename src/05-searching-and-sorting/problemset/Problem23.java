/**
 * Problem 23 — Capacity to Ship Packages Within D Days. Packages ship in order; each day loads a
 * contiguous prefix up to the ship's capacity. Return the least capacity that ships everything within
 * {@code days} days. Binary-search the capacity over {@code [max(weights), sum(weights)]}.
 */
class Problem23 {

	/**
	 * Returns the minimum daily capacity that ships all {@code weights} (in order) within {@code days}
	 * days, where each day carries a contiguous prefix of the remaining packages.
	 *
	 * @param weights package weights in shipping order
	 * @param days the number of available days
	 * @return the minimum feasible daily capacity
	 */
	int shipWithinDays(int[] weights, int days) {
		// TODO: binary-search the capacity; feasibility is monotone.
		throw new UnsupportedOperationException("TODO: implement shipWithinDays");
	}
}
