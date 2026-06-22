/** Tier 3 — Problem 12: Task Scheduler with Deadlines and Penalties. */
public class Problem12 {

	/**
	 * Schedules unit-time tasks on a single machine to minimize the total penalty of late tasks, and
	 * returns that minimum penalty. Task {@code i} has integer {@code deadlines[i]} (a time slot
	 * {@code >= 1}) and {@code penalties[i]} incurred if it finishes after its deadline. This is the
	 * classic matroid-scheduling problem: greedily admit tasks by decreasing penalty, placing each in
	 * the latest free slot on or before its deadline.
	 *
	 * @param deadlines the per-task deadlines, parallel to {@code penalties}
	 * @param penalties the per-task late penalties, parallel to {@code deadlines}
	 * @return the minimum total penalty of the late tasks
	 */
	public long minPenalty(int[] deadlines, int[] penalties) {
		// TODO: sort by penalty descending; schedule each in the latest open slot <= its deadline,
		// otherwise count its penalty as late.
		throw new UnsupportedOperationException("TODO: implement minPenalty");
	}
}
