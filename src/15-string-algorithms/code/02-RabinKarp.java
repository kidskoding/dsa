import java.util.List;

/**
 * Rabin–Karp string matching via a polynomial rolling hash.
 *
 * <p>Slides a fixed-width window over the text, comparing window hashes against the pattern hash
 * and verifying candidates directly to reject spurious collisions.
 */
class RabinKarp {

	/** A common radix for the polynomial rolling hash. */
	public static final long DEFAULT_BASE = 256L;

	/** A large prime modulus for the polynomial rolling hash. */
	public static final long DEFAULT_MODULUS = 1_000_000_007L;

	/**
	 * Computes the polynomial rolling hash of {@code s} in Horner form under the given {@code base}
	 * (radix) and {@code modulus}.
	 *
	 * @param s the string to hash
	 * @param base the radix
	 * @param modulus the modulus
	 * @return the rolling hash value, in {@code [0, modulus)}
	 * @throws NullPointerException if {@code s} is null
	 */
	public long hash(String s, long base, long modulus) {
		// TODO: fold each character into the hash via Horner's method modulo `modulus`.
		throw new UnsupportedOperationException("TODO: implement hash");
	}

	/**
	 * Returns every start index in {@code text} where {@code pattern} occurs, in ascending order,
	 * using the default base and modulus. Overlapping matches are reported. An empty pattern matches
	 * at every index {@code 0..text.length} inclusive.
	 *
	 * @param text the text to search
	 * @param pattern the pattern to find
	 * @return the list of 0-based match start indices
	 * @throws NullPointerException if {@code text} or {@code pattern} is null
	 */
	public List<Integer> search(String text, String pattern) {
		// TODO: roll the window hash across the text and verify each hash match character-by-character.
		throw new UnsupportedOperationException("TODO: implement search");
	}
}
