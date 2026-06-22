/** Tier 1 — Problem 05: Lexicographically Smallest Subsequence. */
public class Problem05 {

	/**
	 * Removes exactly {@code k} digits from {@code digits} (order preserved) so the remaining string
	 * is the smallest possible number, returned with no leading zeros except the value {@code "0"}.
	 * Uses a monotonic-stack greedy that drops larger preceding digits.
	 *
	 * @param digits the input digit string
	 * @param k the exact number of digits to remove ({@code 0 <= k <= digits.length()})
	 * @return the lexicographically smallest resulting number as a string
	 */
	public String removeKDigits(String digits, int k) {
		// TODO: greedily pop larger digits from a stack while removals remain, then strip leading
		// zeros.
		throw new UnsupportedOperationException("TODO: implement removeKDigits");
	}
}
