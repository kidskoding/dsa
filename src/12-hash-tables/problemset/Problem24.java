/** Problem 24 — LRU Cache. See {@code PROBLEM_SET.md}. */
class Problem24 {

	/**
	 * Constructs an LRU cache with the given positive capacity.
	 *
	 * @param capacity the maximum number of entries, {@code >= 1}
	 */
	Problem24(int capacity) {
		// TODO: initialize a hash map plus a recency structure (doubly linked list or access-order map).
		throw new UnsupportedOperationException("TODO: implement LRU cache constructor");
	}

	/**
	 * Returns the value for {@code key}, or {@code -1} if absent, marking it most-recently used.
	 *
	 * @param key the key to look up
	 * @return the value, or -1 if not present
	 */
	int get(int key) {
		// TODO: look up key; on hit, mark most-recently used and return value, else return -1.
		throw new UnsupportedOperationException("TODO: implement get");
	}

	/**
	 * Inserts or updates {@code key} with {@code value}, marking it most-recently used and evicting
	 * the least-recently-used entry if capacity is exceeded.
	 *
	 * @param key the key to insert or update
	 * @param value the value to associate
	 */
	void put(int key, int value) {
		// TODO: insert/update; mark most-recently used; evict LRU entry when over capacity.
		throw new UnsupportedOperationException("TODO: implement put");
	}
}
