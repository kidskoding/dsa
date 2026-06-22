/**
 * Problem 12 — Maximum XOR pair.
 *
 * <p>Given an array of integers, insert their binary representations into a binary trie and return
 * the maximum XOR over all pairs in \( O(n \cdot b) \) time for \( b \)-bit integers.
 */
public class Problem12 {

	/**
	 * Returns the maximum value of {@code a ^ b} over all pairs in {@code nums}.
	 *
	 * @param nums the input integers
	 * @return the maximum pairwise XOR, or 0 if fewer than two values are present
	 */
	public int maxXor(int[] nums) {
		// TODO: insert each number's bits (most-significant first) into a binary
		// trie, then for each number greedily walk toward the opposite bit to
		// maximise XOR.
		throw new UnsupportedOperationException("TODO: implement maxXor");
	}
}
