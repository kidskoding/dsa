/**
 * Problem 13 — Decode Ways.
 *
 * <p>Digits encode letters via {@code 'A'->"1" ... 'Z'->"26"}. Count the ways to decode the
 * digit string {@code s}, respecting leading and standalone zeros.
 */
class Problem13 {

	/**
	 * Returns the number of ways to decode {@code s}.
	 *
	 * @param s the digit string (non-empty)
	 * @return the number of valid decodings
	 */
	int numDecodings(String s) {
		// TODO: dp[i] adds dp[i-1] if s[i-1] in 1..9 and dp[i-2] if s[i-2..i-1] in 10..26.
		throw new UnsupportedOperationException("TODO: implement numDecodings");
	}
}
