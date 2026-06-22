/**
 * Shared union-find (disjoint-set) helper for the greedy problem set — used by Kruskal's MST in
 * Problem 11. Supports near-constant-time {@code find} and {@code union} with path compression and
 * union by rank.
 */
public class DisjointSet {

	/**
	 * Creates a disjoint-set structure over elements {@code 0..n-1}, each initially in its own set.
	 *
	 * @param n the number of elements
	 */
	public DisjointSet(int n) {
		// TODO: initialize parent and rank arrays for n singleton sets.
		throw new UnsupportedOperationException("TODO: implement DisjointSet constructor");
	}

	/**
	 * Returns the canonical representative of the set containing {@code x}, applying path
	 * compression.
	 *
	 * @param x the element to look up
	 * @return the representative of {@code x}'s set
	 */
	public int find(int x) {
		// TODO: follow parents to the root, compressing the path.
		throw new UnsupportedOperationException("TODO: implement find");
	}

	/**
	 * Merges the sets containing {@code a} and {@code b}. Returns {@code true} if they were in
	 * different sets (a merge occurred), {@code false} if they were already joined.
	 *
	 * @param a an element of the first set
	 * @param b an element of the second set
	 * @return whether a merge took place
	 */
	public boolean union(int a, int b) {
		// TODO: union by rank; return false when the roots already coincide.
		throw new UnsupportedOperationException("TODO: implement union");
	}
}
