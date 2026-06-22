/**
 * A hash table that resolves collisions by open addressing: all entries live in a single backing
 * array and probing finds the next free slot. Implement from scratch — see the workbook page {@code
 * open-addressing.md} for linear/quadratic probing, double hashing, and tombstone deletion.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
class OpenAddressingHashTable<K, V> {

	/**
	 * Associates {@code value} with {@code key}, overwriting any existing value for an equal key,
	 * probing for a free slot on collision.
	 *
	 * @param key the key, non-null
	 * @param value the value to associate
	 */
	public void put(K key, V value) {
		// TODO: probe from the home slot, reusing tombstones, until the key or a free slot is found.
		throw new UnsupportedOperationException("TODO: implement put");
	}

	/**
	 * Returns the value associated with {@code key}, or {@code null} if no equal key is present.
	 *
	 * @param key the key to look up, non-null
	 * @return the associated value, or {@code null} if absent
	 */
	public V get(K key) {
		// TODO: probe from the home slot, skipping tombstones, stopping at a truly empty slot.
		throw new UnsupportedOperationException("TODO: implement get");
	}

	/**
	 * Removes the entry for {@code key} if present, leaving a tombstone so later probes still work.
	 *
	 * @param key the key to remove, non-null
	 * @return {@code true} if an entry was removed, {@code false} otherwise
	 */
	public boolean remove(K key) {
		// TODO: locate the key by probing and mark its slot as a tombstone.
		throw new UnsupportedOperationException("TODO: implement remove");
	}

	/**
	 * Returns whether an entry for {@code key} exists.
	 *
	 * @param key the key to test, non-null
	 * @return {@code true} if {@code key} is present
	 */
	public boolean containsKey(K key) {
		// TODO: probe for the key, treating tombstones as occupied for continuation.
		throw new UnsupportedOperationException("TODO: implement containsKey");
	}

	/**
	 * Returns the number of key-value entries currently stored (excluding tombstones).
	 *
	 * @return the entry count
	 */
	public int size() {
		// TODO: track and return the live entry count.
		throw new UnsupportedOperationException("TODO: implement size");
	}
}
