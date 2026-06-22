/**
 * Stable matching via the Gale–Shapley deferred-acceptance algorithm. Proposers propose down their
 * preference lists; receivers tentatively hold their best offer so far. The result is a stable
 * matching with no blocking pair, and is proposer-optimal. See the workbook page {@code
 * stable-matching.md}.
 */
class StableMatching {

	/**
	 * Runs Gale–Shapley with the first side proposing and returns the matching as an array {@code
	 * match} where {@code match[p]} is the receiver assigned to proposer {@code p}. Both sides have
	 * {@code n} members indexed {@code 0..n-1}.
	 *
	 * @param proposerPrefs {@code proposerPrefs[p]} lists receivers in decreasing preference for
	 *		 proposer {@code p}
	 * @param receiverPrefs {@code receiverPrefs[r]} lists proposers in decreasing preference for
	 *		 receiver {@code r}
	 * @return {@code match} where {@code match[p]} is proposer {@code p}'s assigned receiver
	 */
	public int[] match(int[][] proposerPrefs, int[][] receiverPrefs) {
		// TODO: while a free proposer exists, propose to the next receiver; receivers keep their
		// preferred suitor.
		throw new UnsupportedOperationException("TODO: implement match");
	}

	/**
	 * Returns {@code true} if the given matching is stable: there is no blocking pair {@code (p, r)}
	 * who both prefer each other to their assigned partners. {@code match[p]} is proposer {@code p}'s
	 * assigned receiver.
	 *
	 * @param proposerPrefs the proposers' preference lists
	 * @param receiverPrefs the receivers' preference lists
	 * @param match the proposed matching, proposer-indexed
	 * @return whether the matching has no blocking pair
	 */
	public boolean isStable(int[][] proposerPrefs, int[][] receiverPrefs, int[] match) {
		// TODO: for every proposer/receiver pair, check whether they form a blocking pair.
		throw new UnsupportedOperationException("TODO: implement isStable");
	}
}
