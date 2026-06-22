/**
 * The 0/1 knapsack problem: given items with weights and values and a weight capacity, choose a
 * subset of maximum total value whose total weight does not exceed the capacity. Each item is taken
 * at most once (0/1). Solved with the pseudo-polynomial {@code O(nW)} DP. See {@code knapsack.md}.
 */
class Knapsack {

	/**
	 * Returns the maximum total value achievable without exceeding {@code capacity}, where item
	 * {@code i} has weight {@code weights[i]} and value {@code values[i]}.
	 *
	 * @param weights the item weights (non-negative); parallel to {@code values}
	 * @param values the item values (non-negative)
	 * @param capacity the weight budget ({@code capacity >= 0})
	 * @return the optimal achievable value
	 */
	public int maxValue(int[] weights, int[] values, int capacity) {
		// TODO: OPT(i,w) = max(OPT(i-1,w), values[i] + OPT(i-1, w - weights[i])).
		throw new UnsupportedOperationException("TODO: implement maxValue");
	}
}
