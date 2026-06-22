/**
 * Problem 5 — Heap Index Arithmetic.
 *
 * <p>For a 0-indexed d-ary heap with branching factor {@code d}, compute the parent index of a node
 * and the index of a node's {@code j}-th child (0-indexed).
 */
final class Problem5 {

	private Problem5() {}

	/**
	 * Returns the parent index of node {@code i}, or {@code -1} if {@code i} is the root.
	 *
	 * @param i the node index
	 * @param d the branching factor
	 * @return the parent index, or {@code -1} for the root
	 */
	static int parent(int i, int d) {
		// TODO: the root (i == 0) has no parent; otherwise return (i - 1) / d.
		throw new UnsupportedOperationException("TODO: implement parent");
	}

	/**
	 * Returns the index of the {@code j}-th child (0-indexed) of node {@code i}.
	 *
	 * @param i the node index
	 * @param j the child ordinal, {@code 0 <= j < d}
	 * @param d the branching factor
	 * @return the index of the {@code j}-th child
	 */
	static int child(int i, int j, int d) {
		// TODO: the j-th child of node i in a d-ary heap is d * i + j + 1.
		throw new UnsupportedOperationException("TODO: implement child");
	}
}
