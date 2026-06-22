/**
 * A bare disjoint-set forest with no balancing or compression heuristics. This is the baseline
 * representation from the workbook page {@code union-find.md}: every element starts in its own
 * singleton set, {@code find} walks parent pointers to the representative, and {@code union} links
 * one root under the other. Implement each method from first principles.
 */
class UnionFind {

	/**
	 * Initializes a universe of {@code n} elements labelled {@code 0..n-1}, each in its own singleton
	 * set.
	 *
	 * @param n the number of elements, n &ge; 0
	 */
	public UnionFind(int n) {
		// TODO: allocate and seed the parent array so each element is its own root.
		throw new UnsupportedOperationException("TODO: implement UnionFind constructor");
	}

	/**
	 * Creates a fresh singleton set for element {@code x}, growing the universe if needed.
	 *
	 * @param x the element to add
	 */
	public void makeSet(int x) {
		// TODO: ensure x exists and is its own representative.
		throw new UnsupportedOperationException("TODO: implement makeSet");
	}

	/**
	 * Returns the representative (root) of the set containing {@code x} by following parent pointers.
	 *
	 * @param x the element to query
	 * @return the representative of x's set
	 */
	public int find(int x) {
		// TODO: walk parent pointers up to the root and return it.
		throw new UnsupportedOperationException("TODO: implement find");
	}

	/**
	 * Merges the sets containing {@code x} and {@code y} by linking one root under the other.
	 *
	 * @param x an element of the first set
	 * @param y an element of the second set
	 */
	public void union(int x, int y) {
		// TODO: find both roots and, if distinct, link one under the other.
		throw new UnsupportedOperationException("TODO: implement union");
	}

	/**
	 * Reports whether {@code x} and {@code y} currently belong to the same set.
	 *
	 * @param x the first element
	 * @param y the second element
	 * @return {@code true} if both share a representative
	 */
	public boolean connected(int x, int y) {
		// TODO: compare the representatives of x and y.
		throw new UnsupportedOperationException("TODO: implement connected");
	}

	/**
	 * Returns the number of distinct sets currently present in the universe.
	 *
	 * @return the count of disjoint sets
	 */
	public int count() {
		// TODO: track or recompute the number of distinct representatives.
		throw new UnsupportedOperationException("TODO: implement count");
	}
}
