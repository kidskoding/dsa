/**
 * A van Emde Boas tree over the bounded universe {@code {0, ..., u-1}} supporting insert, delete,
 * member, successor, and predecessor in {@code O(log log u)} time. See the workbook page {@code
 * van-emde-boas-trees.md}.
 */
class VanEmdeBoasTree {

	/** Sentinel returned by successor/predecessor queries when no answer exists. */
	public static final int NIL = -1;

	/** A recursive vEB cluster: a summary structure plus {@code sqrt(u)} child clusters. */
	static final class VebNode {
		final int universe;
		int min;
		int max;
		VebNode summary;
		VebNode[] clusters;

		VebNode(int universe) {
			this.universe = universe;
			this.min = NIL;
			this.max = NIL;
		}
	}

	private final VebNode root;

	/**
	 * Creates an empty structure over the universe {@code {0, ..., universe - 1}}.
	 *
	 * @param universe the universe size, expected to be a power of two and {@code >= 2}
	 */
	public VanEmdeBoasTree(int universe) {
		// TODO: build the recursive cluster tree sized to the (rounded) universe.
		this.root = new VebNode(universe);
	}

	/**
	 * Inserts {@code x} into the set.
	 *
	 * @param x a value in {@code [0, universe)}
	 */
	public void insert(int x) {
		// TODO: recurse, maintaining min/max shortcuts and the summary structure.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Deletes {@code x} from the set if present.
	 *
	 * @param x a value in {@code [0, universe)}
	 */
	public void delete(int x) {
		// TODO: recurse, repairing min/max and clearing summary bits as clusters empty.
		throw new UnsupportedOperationException("TODO: implement delete");
	}

	/**
	 * Returns whether {@code x} is a member of the set.
	 *
	 * @param x a value in {@code [0, universe)}
	 * @return {@code true} if present
	 */
	public boolean member(int x) {
		// TODO: check min/max shortcuts then recurse into the relevant cluster.
		throw new UnsupportedOperationException("TODO: implement member");
	}

	/**
	 * Returns the smallest stored value strictly greater than {@code x}, or {@link #NIL}.
	 *
	 * @param x the query value
	 * @return the successor, or {@link #NIL} if none
	 */
	public int successor(int x) {
		// TODO: use min/max and the summary to find the next-larger element in O(log log u).
		throw new UnsupportedOperationException("TODO: implement successor");
	}

	/**
	 * Returns the largest stored value strictly less than {@code x}, or {@link #NIL}.
	 *
	 * @param x the query value
	 * @return the predecessor, or {@link #NIL} if none
	 */
	public int predecessor(int x) {
		// TODO: symmetric to successor using the summary structure.
		throw new UnsupportedOperationException("TODO: implement predecessor");
	}
}
