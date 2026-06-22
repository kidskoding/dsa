import java.util.List;
import java.util.Map;

/** Problem 6 — Group By Parity Key. See {@code PROBLEM_SET.md}. */
class Problem6 {

	/**
	 * Partitions the values of {@code a} into groups keyed by their non-negative remainder modulo 3.
	 * Returns a map from key to the list of values that map to it, in original order.
	 *
	 * @param a the input array, non-null
	 * @return a map from remainder key to its list of values
	 */
	Map<Integer, List<Integer>> groupByMod3(int[] a) {
		// TODO: for each value compute ((v % 3) + 3) % 3 and append it to that key's list.
		throw new UnsupportedOperationException("TODO: implement groupByMod3");
	}
}
