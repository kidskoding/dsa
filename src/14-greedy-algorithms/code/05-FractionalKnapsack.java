/**
 * Fractional knapsack: maximize value carried in a capacity-limited sack when items may be split.
 * The greedy takes items in decreasing value-to-weight ratio, splitting the last one. See the
 * workbook page {@code fractional-knapsack.md}.
 */
class FractionalKnapsack {

	/**
	 * Returns the maximum total value obtainable by filling a sack of the given {@code capacity},
	 * where any fraction of an item may be taken. Item {@code i} has weight {@code weights[i]} and
	 * value {@code values[i]}.
	 *
	 * @param weights the item weights (each positive), parallel to {@code values}
	 * @param values the item values (each non-negative), parallel to {@code weights}
	 * @param capacity the sack's weight capacity (non-negative)
	 * @return the maximum achievable value
	 */
	public double maxValue(double[] weights, double[] values, double capacity) {
		// TODO: sort by value/weight descending, take whole items until one must be split.
		throw new UnsupportedOperationException("TODO: implement maxValue");
	}

	/**
	 * Returns the fraction of each item taken by the greedy, parallel to the input arrays — {@code
	 * 1.0} for fully taken items, a value in {@code (0, 1)} for the split item, and {@code 0.0} for
	 * items left behind.
	 *
	 * @param weights the item weights, parallel to {@code values}
	 * @param values the item values, parallel to {@code weights}
	 * @param capacity the sack's weight capacity
	 * @return the per-item taken fractions, indexed like the inputs
	 */
	public double[] selectionFractions(double[] weights, double[] values, double capacity) {
		// TODO: replay the ratio-greedy, recording how much of each original item is taken.
		throw new UnsupportedOperationException("TODO: implement selectionFractions");
	}
}
