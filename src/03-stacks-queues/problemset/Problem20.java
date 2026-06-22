/**
 * Problem 20 — Online Stock Span.
 *
 * <p>For each daily price, return the span: the number of consecutive prior days (including today)
 * whose price was less than or equal to today's. Use a monotonic decreasing stack of (price, span).
 */
final class Problem20 {

	// TODO: keep a stack of (price, span) pairs.

	/** Creates a stock-span calculator with no recorded prices. */
	Problem20() {
		// TODO: initialize the backing stack.
		throw new UnsupportedOperationException("TODO: implement Problem20 constructor");
	}

	/**
	 * Records today's price and returns its span.
	 *
	 * @param price today's stock price
	 * @return the price span for today
	 */
	int next(int price) {
		// TODO: fold spans of all prices <= price into the current span.
		throw new UnsupportedOperationException("TODO: implement next");
	}
}
