/**
 * Problem 14 — Task Scheduler.
 *
 * <p>Given CPU tasks identified by uppercase letters and a cooldown {@code n}, return the minimum
 * number of time units to finish all tasks, where two identical tasks must be at least {@code n}
 * units apart. A heap-driven greedy schedule runs the most-frequent ready task.
 */
final class Problem14 {

	private Problem14() {}

	/**
	 * Returns the minimum number of time units to run all tasks under the cooldown.
	 *
	 * @param tasks the task labels
	 * @param n the cooldown between identical tasks
	 * @return the minimum schedule length, counting idle units
	 */
	static int leastInterval(char[] tasks, int n) {
		// TODO: greedily schedule the most-frequent ready task using a max-heap of counts.
		throw new UnsupportedOperationException("TODO: implement leastInterval");
	}
}
