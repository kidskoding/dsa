/**
 * Problem 05 — Parent / child index arithmetic.
 *
 * <p>For a 0-indexed {@code d}-ary heap with branching factor {@code d}, compute the parent index
 * of a given node and the index of its {@code j}-th child.
 */
public final class Problem05 {

	private Problem05() {}

	/**
	 * Returns the parent index of node {@code i} in a {@code d}-ary heap.
	 *
	 * @param i a 0-indexed node index ({@code i > 0})
	 * @param d the branching factor ({@code d >= 2})
	 * @return the parent index {@code (i - 1) / d}
	 */
	public static int parent(int i, int d) {
		// TODO: compute the parent index using the branching factor.
		throw new UnsupportedOperationException("TODO: implement parent");
	}

	/**
	 * Returns the index of the {@code j}-th child of node {@code i} in a {@code d}-ary heap.
	 *
	 * @param i a 0-indexed node index
	 * @param j the child ordinal ({@code 0 <= j < d})
	 * @param d the branching factor ({@code d >= 2})
	 * @return the child index {@code d * i + j + 1}
	 */
	public static int child(int i, int j, int d) {
		// TODO: compute the j-th child index using the branching factor.
		throw new UnsupportedOperationException("TODO: implement child");
	}
}
