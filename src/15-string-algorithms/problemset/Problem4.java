/** Problem 4 — Rolling Hash. See {@code PROBLEM_SET.md}. */
class Problem4 {

	/**
	 * Computes the polynomial rolling hash of {@code s} under {@code base} and {@code mod} in Horner
	 * form, with each character contributing its int code point. Returns a non-negative value in
	 * {@code [0, mod)}.
	 *
	 * @param s the input string
	 * @param base the radix
	 * @param mod the modulus
	 * @return the rolling hash in {@code [0, mod)}
	 */
	long rollingHash(String s, long base, long mod) {
		// TODO: fold left to right: h = (h * base + s[i]) % mod.
		throw new UnsupportedOperationException("TODO: implement rollingHash");
	}
}
