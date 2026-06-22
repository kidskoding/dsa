/** Greedy Algorithms — Problem 22: Minimum Refueling Stops. */
class Problem22 {

	/**
	 * Returns the minimum number of refueling stops to reach {@code target}, or {@code -1} if
	 * impossible. Push every passed station's fuel onto a max-heap and refuel from the largest.
	 *
	 * @param target the distance to travel
	 * @param startFuel the initial fuel
	 * @param stations the stations as {@code [position, fuel]} pairs
	 * @return the minimum number of stops, or {@code -1}
	 */
	int minRefuelStops(int target, int startFuel, int[][] stations) {
		// TODO: max-heap of passed station fuels; refuel greedily when stranded.
		throw new UnsupportedOperationException("TODO: implement minRefuelStops");
	}
}
