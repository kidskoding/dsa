/**
 * Building-block hash functions. Implement each from first principles — see the workbook page
 * {@code hash-functions.md} for the division and multiplication methods, polynomial string hashing,
 * and the SUHA assumption.
 */
class HashFunctions {

	/**
	 * Maps {@code key} into the range {@code [0, m)} using the division method, {@code key mod m}.
	 * The result is non-negative even when {@code key} is negative.
	 *
	 * @param key the key to hash
	 * @param m the table size, m &gt; 0
	 * @return a slot index in {@code [0, m)}
	 */
	public int divisionHash(int key, int m) {
		// TODO: reduce key modulo m, normalizing any negative remainder into [0, m).
		throw new UnsupportedOperationException("TODO: implement divisionHash");
	}

	/**
	 * Maps {@code key} into the range {@code [0, m)} using the multiplication method: take the
	 * fractional part of {@code key * A} for a constant {@code A} in {@code (0, 1)} and scale by
	 * {@code m}.
	 *
	 * @param key the key to hash
	 * @param m the table size, m &gt; 0
	 * @param a the multiplier constant, 0 &lt; a &lt; 1
	 * @return a slot index in {@code [0, m)}
	 */
	public int multiplicationHash(int key, int m, double a) {
		// TODO: compute floor(m * frac(key * a)).
		throw new UnsupportedOperationException("TODO: implement multiplicationHash");
	}

	/**
	 * Computes a polynomial rolling hash of {@code s} using Horner's method with the given {@code
	 * base} and {@code mod}, returning a value in {@code [0, mod)}.
	 *
	 * @param s the string to hash, non-null
	 * @param base the polynomial base
	 * @param mod the modulus, mod &gt; 0
	 * @return the polynomial hash in {@code [0, mod)}
	 */
	public long polynomialHash(String s, int base, long mod) {
		// TODO: fold each character with hash = (hash * base + ch) mod mod via Horner's rule.
		throw new UnsupportedOperationException("TODO: implement polynomialHash");
	}
}
