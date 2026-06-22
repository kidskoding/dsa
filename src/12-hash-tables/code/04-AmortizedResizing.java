/**
 * A hash table that grows and shrinks its backing array to keep the load factor bounded, giving
 * amortized {@code O(1)} operations. Implement from scratch — see the workbook page {@code
 * amortized-resizing.md} for doubling, halving, and rehashing.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
class AmortizedResizing<K, V> {

	/**
	 * Associates {@code value} with {@code key}, growing and rehashing the table when the load factor
	 * exceeds the upper threshold.
	 *
	 * @param key the key, non-null
	 * @param value the value to associate
	 */
	public void put(K key, V value) {
		// TODO: insert, then if load factor exceeds the grow threshold, double capacity and rehash.
		throw new UnsupportedOperationException("TODO: implement put");
	}

	/**
	 * Returns the value associated with {@code key}, or {@code null} if no equal key is present.
	 *
	 * @param key the key to look up, non-null
	 * @return the associated value, or {@code null} if absent
	 */
	public V get(K key) {
		// TODO: hash within the current capacity and look the key up.
		throw new UnsupportedOperationException("TODO: implement get");
	}

	/**
	 * Removes the entry for {@code key} if present, shrinking and rehashing when the load factor
	 * drops below the lower threshold.
	 *
	 * @param key the key to remove, non-null
	 * @return {@code true} if an entry was removed, {@code false} otherwise
	 */
	public boolean remove(K key) {
		// TODO: remove, then if load factor drops below the shrink threshold, halve capacity and
		// rehash.
		throw new UnsupportedOperationException("TODO: implement remove");
	}

	/**
	 * Returns whether an entry for {@code key} exists.
	 *
	 * @param key the key to test, non-null
	 * @return {@code true} if {@code key} is present
	 */
	public boolean containsKey(K key) {
		// TODO: look the key up within the current capacity.
		throw new UnsupportedOperationException("TODO: implement containsKey");
	}

	/**
	 * Returns the number of key-value entries currently stored.
	 *
	 * @return the entry count
	 */
	public int size() {
		// TODO: track and return the live entry count.
		throw new UnsupportedOperationException("TODO: implement size");
	}

	/**
	 * Returns the current capacity of the backing array, which reflects past grow/shrink operations.
	 *
	 * @return the current backing-array capacity
	 */
	public int capacity() {
		// TODO: return the current backing-array length.
		throw new UnsupportedOperationException("TODO: implement capacity");
	}
}
