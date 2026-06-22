import java.util.Arrays;

/**
 * Problem 19: Toll Road Reimbursement (Bellman-Ford). Return minimum net tolls from city 0 to every
 * city over directed roads that may carry negative (rebate) weights.
 */
class Problem19 {

	/**
	 * Returns the minimum net toll from city 0 to each city, {@code Integer.MAX_VALUE} if unreachable.
	 *
	 * @param n the number of cities
	 * @param roads directed roads {@code {u, v, w}} (weights may be negative)
	 * @return an array of minimum net tolls from city 0
	 */
	int[] cheapestTolls(int n, int[][] roads) {
		// TODO: Bellman-Ford from city 0; relax all edges n-1 times; leave unreachable cities at Integer.MAX_VALUE.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
