import java.util.List;

/**
 * Activity-selection greedy: choose the maximum number of mutually compatible activities by
 * repeatedly taking the one that finishes earliest. See the workbook page {@code
 * activity-selection.md}.
 */
class ActivitySelection {

	/**
	 * Returns the maximum number of mutually compatible activities, where activity {@code i} occupies
	 * the half-open interval {@code [start[i], finish[i])}. Two activities are compatible if their
	 * intervals do not overlap. Uses the earliest-finish-time greedy.
	 *
	 * @param start the start times, parallel to {@code finish}
	 * @param finish the finish times, parallel to {@code start}
	 * @return the size of a maximum compatible set
	 */
	public int maxActivities(int[] start, int[] finish) {
		// TODO: sort by finish time, then greedily take each activity that starts after the last
		// selected one finishes.
		throw new UnsupportedOperationException("TODO: implement maxActivities");
	}

	/**
	 * Returns the indices (into the input arrays) of one maximum compatible set, chosen by the
	 * earliest-finish-time greedy, in increasing order of finish time.
	 *
	 * @param start the start times, parallel to {@code finish}
	 * @param finish the finish times, parallel to {@code start}
	 * @return the original indices of a selected maximum compatible set
	 */
	public List<Integer> selectActivities(int[] start, int[] finish) {
		// TODO: track original indices while applying the earliest-finish-time greedy.
		throw new UnsupportedOperationException("TODO: implement selectActivities");
	}
}
