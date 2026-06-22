/**
 * A disjoint-set forest that applies the <em>union by rank</em> heuristic: each root carries a rank
 * (an upper bound on its subtree height), and {@code union} always links the shorter tree under the
 * taller one, bumping the rank only on a tie. This keeps trees shallow without compression. See the
 * workbook page {@code union-by-rank.md}. Implement from first principles.
 */
class UnionByRank {

	/**
	 * Initializes a universe of {@code n} elements labelled {@code 0..n-1}, each a singleton set with
	 * rank zero.
	 *
	 * @param n the number of elements, n &ge; 0
	 */
	public UnionByRank(int n) {
		// TODO: allocate parent and rank arrays so each element is its own rank-0 root.
		throw new UnsupportedOperationException("TODO: implement UnionByRank constructor");
	}

	/**
	 * Creates a fresh rank-zero singleton set for element {@code x}, growing the universe if needed.
	 *
	 * @param x the element to add
	 */
	public void makeSet(int x) {
		// TODO: ensure x exists as its own rank-0 representative.
		throw new UnsupportedOperationException("TODO: implement makeSet");
	}

	/**
	 * Returns the representative (root) of the set containing {@code x}.
	 *
	 * @param x the element to query
	 * @return the representative of x's set
	 */
	public int find(int x) {
		// TODO: walk parent pointers up to the root and return it.
		throw new UnsupportedOperationException("TODO: implement find");
	}

	/**
	 * Merges the sets containing {@code x} and {@code y}, attaching the lower-rank root beneath the
	 * higher-rank root and incrementing rank only on a tie.
	 *
	 * @param x an element of the first set
	 * @param y an element of the second set
	 */
	public void union(int x, int y) {
		// TODO: find both roots; link by rank, bumping the surviving root's rank on a tie.
		throw new UnsupportedOperationException("TODO: implement union by rank");
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
	 * Returns the stored rank of element {@code x}'s root — used by the workbook to verify the rank
	 * bound {@code rank(root) <= floor(log2 size)}.
	 *
	 * @param x the element whose root rank to read
	 * @return the rank of x's representative
	 */
	public int rankOf(int x) {
		// TODO: return the rank recorded at the root of x's set.
		throw new UnsupportedOperationException("TODO: implement rankOf");
	}
}
