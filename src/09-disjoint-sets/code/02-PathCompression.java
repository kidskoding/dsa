/**
 * A disjoint-set forest that applies the <em>path compression</em> heuristic during {@code find}:
 * after locating a root, every node on the access path is re-pointed closer to (or directly at) the
 * root, flattening the tree for future queries. See the workbook page {@code path-compression.md}.
 * Implement {@code find} so that it compresses; the other operations follow the standard forest.
 */
class PathCompression {

	/**
	 * Initializes a universe of {@code n} elements labelled {@code 0..n-1}, each in its own singleton
	 * set.
	 *
	 * @param n the number of elements, n &ge; 0
	 */
	public PathCompression(int n) {
		// TODO: allocate and seed the parent array so each element is its own root.
		throw new UnsupportedOperationException("TODO: implement PathCompression constructor");
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
	 * Returns the representative of {@code x}'s set, compressing the access path so that traversed
	 * nodes point nearer to the root.
	 *
	 * @param x the element to query
	 * @return the representative of x's set
	 */
	public int find(int x) {
		// TODO: find the root, then repoint nodes on the path toward it (path compression).
		throw new UnsupportedOperationException("TODO: implement find with path compression");
	}

	/**
	 * Merges the sets containing {@code x} and {@code y} by linking one compressed root under the
	 * other.
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
	 * Returns the length of the parent-pointer path from {@code x} to its root <em>before</em> any
	 * compression — a probe used by the workbook to observe how compression flattens the forest.
	 *
	 * @param x the element whose depth to measure
	 * @return the number of parent links from x to its root
	 */
	public int pathLengthToRoot(int x) {
		// TODO: count parent links from x up to its root without mutating the forest.
		throw new UnsupportedOperationException("TODO: implement pathLengthToRoot");
	}
}
