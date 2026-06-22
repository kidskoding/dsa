/**
 * Problem 16 — Longest Shared Call-Sign Prefix.
 *
 * <p>Insert all call-signs into a trie and descend from the root while exactly one child exists and
 * the node is not the end of a shorter call-sign, returning the longest prefix shared by all.
 */
class Problem16 {

	/**
	 * Returns the longest prefix shared by every call-sign.
	 *
	 * @param callSigns the broadcast call-signs (lowercase letters)
	 * @return the longest common prefix, or {@code ""} if none is shared
	 */
	String run(String[] callSigns) {
		// TODO: build a trie, then descend while branching is unambiguous and no shorter sign ends.
		throw new UnsupportedOperationException("TODO: implement run");
	}
}
