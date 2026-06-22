/**
 * Problem 14 — LRU cache. An LRU cache with O(1) {@code get} and {@code put}, backed by a doubly
 * linked list (for recency order) plus a hash map (for O(1) lookup).
 */
public class Problem14 {

	/**
	 * Constructs a cache with the given capacity.
	 *
	 * @param capacity the maximum number of entries
	 */
	public Problem14(int capacity) {
		// TODO: initialize the map and the doubly linked recency list.
		throw new UnsupportedOperationException("TODO: implement Problem14 constructor");
	}

	/**
	 * Returns the value for {@code key}, or {@code -1} if absent, marking it most-recently-used.
	 *
	 * @param key the lookup key
	 * @return the cached value or {@code -1}
	 */
	public int get(int key) {
		// TODO: look up, move the node to the front, return its value.
		throw new UnsupportedOperationException("TODO: implement Problem14.get");
	}

	/**
	 * Inserts or updates {@code key} with {@code value}, evicting the least-recently-used entry if
	 * over capacity.
	 *
	 * @param key the key
	 * @param value the value
	 */
	public void put(int key, int value) {
		// TODO: upsert the node at the front, evicting the tail when full.
		throw new UnsupportedOperationException("TODO: implement Problem14.put");
	}
}
