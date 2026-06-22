/** Applied — Problem 17: Build deadlock detection. */
class Problem17 {

	/**
	 * Reports whether the build-dependency graph contains a circular dependency (a deadlock).
	 *
	 * @param taskCount the number of build tasks
	 * @param deps pairs {@code [a, b]} meaning {@code a} must finish before {@code b}
	 * @return {@code true} if a cycle exists, otherwise {@code false}
	 */
	boolean hasDeadlock(int taskCount, int[][] deps) {
		// TODO: detect a cycle in the directed dependency graph.
		throw new UnsupportedOperationException("TODO: implement hasDeadlock");
	}
}
