/**
 * The rod-cutting problem: given a rod of integer length {@code n} and a price table where {@code
 * price[i]} is the revenue for a piece of length {@code i + 1}, cut the rod into integer pieces to
 * maximize total revenue. This unbounded DP runs in {@code O(n^2)}. See {@code rod-cutting.md}.
 */
class RodCutting {

	/**
	 * Returns the maximum revenue obtainable by cutting a rod of length {@code n}, where {@code
	 * prices[i]} is the price of a piece of length {@code i + 1}.
	 *
	 * @param prices the price table; {@code prices[i]} is the value of length {@code i + 1}
	 * @param n the rod length ({@code 0 <= n <= prices.length})
	 * @return the maximum revenue (0 when {@code n == 0})
	 */
	public int maxRevenue(int[] prices, int n) {
		// TODO: r[len] = max over cut c in 1..len of prices[c-1] + r[len - c].
		throw new UnsupportedOperationException("TODO: implement maxRevenue");
	}
}
