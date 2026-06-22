/**
 * A universal hash family of the form {@code h(k) = ((a*k + b) mod p) mod m} with a prime {@code p
 * > m}. Implement from scratch — see the workbook page {@code universal-hashing.md} for the
 * collision-probability bound of {@code 1/m}.
 */
class UniversalHashing {

	/**
	 * Constructs a hash function from the universal family with the given parameters.
	 *
	 * @param p a prime larger than {@code m}
	 * @param m the table size, m &gt; 0
	 * @param a the multiplier, 1 &le; a &le; p-1
	 * @param b the addend, 0 &le; b &le; p-1
	 */
	public UniversalHashing(long p, int m, long a, long b) {
		// TODO: store the family parameters for later hashing; validate the prime/range constraints.
		throw new UnsupportedOperationException("TODO: implement constructor");
	}

	/**
	 * Hashes {@code key} into {@code [0, m)} using {@code ((a*key + b) mod p) mod m}.
	 *
	 * @param key the key to hash
	 * @return a slot index in {@code [0, m)}
	 */
	public int hash(long key) {
		// TODO: apply ((a*key + b) mod p) mod m, guarding against overflow.
		throw new UnsupportedOperationException("TODO: implement hash");
	}

	/**
	 * Empirically estimates the collision probability of {@code x} and {@code y} over every member of
	 * the family {@code (a in [1,p-1], b in [0,p-1])}, returning the fraction of functions for which
	 * {@code hash(x) == hash(y)}.
	 *
	 * @param x the first key
	 * @param y the second key, distinct from {@code x}
	 * @return the empirical collision probability in {@code [0, 1]}
	 */
	public double collisionProbability(long x, long y) {
		// TODO: iterate all (a, b), counting collisions, and divide by the family size.
		throw new UnsupportedOperationException("TODO: implement collisionProbability");
	}
}
