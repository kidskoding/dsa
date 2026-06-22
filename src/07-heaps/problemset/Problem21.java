/**
 * Problem 21 — Single-Threaded CPU.
 *
 * <p>Given tasks {@code tasks[i] = [enqueueTime, processingTime]}, a single-threaded CPU, when idle,
 * picks the available task with the shortest processing time (ties by smaller index), idling to the
 * next arrival when none are ready. Return the order of task indices processed. Use a min-heap.
 */
final class Problem21 {

	private Problem21() {}

	/**
	 * Returns the order of task indices in which the CPU processes them.
	 *
	 * @param tasks the tasks, each a length-2 array {@code [enqueueTime, processingTime]}
	 * @return the processing order as task indices
	 */
	static int[] getOrder(int[][] tasks) {
		// TODO: sort by enqueue time; use a min-heap on (processingTime, index) of ready tasks.
		throw new UnsupportedOperationException("TODO: implement getOrder");
	}
}
