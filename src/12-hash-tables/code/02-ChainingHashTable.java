/**
 * A hash table that resolves collisions by separate chaining: each bucket holds a list of entries
 * whose keys hash to that slot. Implement from scratch — see the workbook page {@code chaining.md}.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
class ChainingHashTable<K, V> {

	/**
	 * Associates {@code value} with {@code key}, overwriting any existing value for an equal key.
	 *
	 * @param key the key, non-null
	 * @param value the value to associate
	 */
	public void put(K key, V value) {
		// TODO: hash the key to a bucket, then update an existing entry or append a new one.
		throw new UnsupportedOperationException("TODO: implement put");
	}

	/**
	 * Returns the value associated with {@code key}, or {@code null} if no equal key is present.
	 *
	 * @param key the key to look up, non-null
	 * @return the associated value, or {@code null} if absent
	 */
	public V get(K key) {
		// TODO: hash the key and scan its bucket's chain for an equal key.
		throw new UnsupportedOperationException("TODO: implement get");
	}

	/**
	 * Removes the entry for {@code key} if present.
	 *
	 * @param key the key to remove, non-null
	 * @return {@code true} if an entry was removed, {@code false} otherwise
	 */
	public boolean remove(K key) {
		// TODO: hash the key and unlink the matching entry from its chain.
		throw new UnsupportedOperationException("TODO: implement remove");
	}

	/**
	 * Returns whether an entry for {@code key} exists.
	 *
	 * @param key the key to test, non-null
	 * @return {@code true} if {@code key} is present
	 */
	public boolean containsKey(K key) {
		// TODO: scan the key's bucket chain for an equal key.
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
}
