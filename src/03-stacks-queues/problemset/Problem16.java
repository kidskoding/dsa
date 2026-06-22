/**
 * Problem 16 — Number of Recent Calls.
 *
 * <p>Count requests within the last 3000 milliseconds. Each {@code ping(t)} records a request at
 * time {@code t} and returns how many requests lie in {@code [t - 3000, t]}. Use a FIFO queue.
 */
final class Problem16 {

	// TODO: keep a queue of request timestamps.

	/** Creates a counter with no recorded requests. */
	Problem16() {
		// TODO: initialize the timestamp queue.
		throw new UnsupportedOperationException("TODO: implement Problem16 constructor");
	}

	/**
	 * Records a request at time {@code t} and returns the number of recent requests.
	 *
	 * @param t the request time in milliseconds, strictly increasing across calls
	 * @return the count of requests in {@code [t - 3000, t]}
	 */
	int ping(int t) {
		// TODO: enqueue t, evict timestamps older than t - 3000, and return the queue size.
		throw new UnsupportedOperationException("TODO: implement ping");
	}
}
