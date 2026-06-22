/** Applied — Problem 19: Pipeline schedule with smallest-id tie-breaking. */
class Problem19 {

	/**
	 * Returns a valid execution order of all steps (smallest available id first when tied), or an
	 * empty array if a cycle makes the pipeline unschedulable.
	 *
	 * @param stepCount the number of steps
	 * @param deps pairs {@code [a, b]} meaning {@code a} must run before {@code b}
	 * @return a valid step order, or an empty array
	 */
	int[] schedule(int stepCount, int[][] deps) {
		// TODO: Kahn's algorithm using a min-priority queue of ready steps.
		throw new UnsupportedOperationException("TODO: implement schedule");
	}
}
