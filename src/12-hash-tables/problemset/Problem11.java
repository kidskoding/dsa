/**
 * Tier 3 — Problem 11: LRU cache. A fixed-capacity cache with {@code O(1)} expected {@code get} and
 * {@code put}; combine a hash map with a doubly linked list so the least recently used entry is
 * evicted when capacity is exceeded.
 */
public class Problem11 {

	/**
	 * Constructs an LRU cache holding at most {@code capacity} entries.
	 *
	 * @param capacity the maximum number of entries, capacity &gt; 0
	 */
	public Problem11(int capacity) {
		// TODO: store capacity and initialize the map plus doubly linked list bookkeeping.
		throw new UnsupportedOperationException("TODO: implement constructor");
	}

	/**
	 * Returns the value for {@code key} and marks it most recently used, or {@code -1} if absent.
	 *
	 * @param key the key to look up
	 * @return the cached value, or {@code -1} if absent
	 */
	public int get(int key) {
		// TODO: look up the node, move it to most-recently-used, and return its value.
		throw new UnsupportedOperationException("TODO: implement get");
	}

	/**
	 * Inserts or updates {@code key} with {@code value}, marking it most recently used and evicting
	 * the least recently used entry if capacity is exceeded.
	 *
	 * @param key the key to insert or update
	 * @param value the value to store
	 */
	public void put(int key, int value) {
		// TODO: upsert the node at most-recently-used, evicting the LRU node when over capacity.
		throw new UnsupportedOperationException("TODO: implement put");
	}
}
