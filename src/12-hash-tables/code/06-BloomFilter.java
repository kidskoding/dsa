/**
 * A space-efficient probabilistic set that answers membership with no false negatives but possible
 * false positives. Implement from scratch — see the workbook page {@code bloom-filters.md} for the
 * optimal number of hash functions and the false-positive analysis.
 */
class BloomFilter {

	/**
	 * Constructs a Bloom filter with {@code numBits} bits and {@code numHashes} independent hash
	 * functions.
	 *
	 * @param numBits the size of the bit array, numBits &gt; 0
	 * @param numHashes the number of hash functions, numHashes &gt; 0
	 */
	public BloomFilter(int numBits, int numHashes) {
		// TODO: allocate the bit array and store the hash count.
		throw new UnsupportedOperationException("TODO: implement constructor");
	}

	/**
	 * Inserts {@code key} into the filter by setting the bits at its {@code numHashes} hashed
	 * positions.
	 *
	 * @param key the key to add, non-null
	 */
	public void add(String key) {
		// TODO: set the bit at each of the key's hashed positions.
		throw new UnsupportedOperationException("TODO: implement add");
	}

	/**
	 * Returns whether {@code key} <em>might</em> be present: {@code false} means definitely absent,
	 * {@code true} means possibly present (subject to false positives).
	 *
	 * @param key the key to test, non-null
	 * @return {@code true} if every hashed bit is set, otherwise {@code false}
	 */
	public boolean mightContain(String key) {
		// TODO: return true only if every hashed-position bit is set.
		throw new UnsupportedOperationException("TODO: implement mightContain");
	}

	/**
	 * Estimates the current false-positive probability given the number of set bits, the bit-array
	 * size, and the hash count.
	 *
	 * @return the estimated false-positive probability in {@code [0, 1]}
	 */
	public double estimatedFalsePositiveRate() {
		// TODO: compute (fraction of set bits) ^ numHashes.
		throw new UnsupportedOperationException("TODO: implement estimatedFalsePositiveRate");
	}
}
