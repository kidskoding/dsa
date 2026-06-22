/** Tier 3 — Problem 13: Minimum Number of Refueling Stops. */
public class Problem13 {

	/**
	 * Returns the minimum number of refueling stops needed to drive {@code target} units starting
	 * with {@code startFuel}, or {@code -1} if the target is unreachable. Each {@code stations[i] =
	 * [position, fuel]} offers {@code fuel} units at {@code position} (the car burns one unit of fuel
	 * per unit of distance). Uses a max-heap greedy: when fuel runs short, retroactively refuel from
	 * the largest passed station.
	 *
	 * @param target the distance to reach
	 * @param startFuel the initial fuel
	 * @param stations the stations, each as {@code [position, fuel]}, in increasing position order
	 * @return the minimum number of stops, or {@code -1} if the target cannot be reached
	 */
	public int minRefuelStops(int target, int startFuel, int[][] stations) {
		// TODO: sweep stations, pushing passed fuel onto a max-heap; when short, pop the largest.
		throw new UnsupportedOperationException("TODO: implement minRefuelStops");
	}
}
