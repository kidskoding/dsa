
/** Shared helpers for the trie problem-set skeletons. Defined once and reused across problems. */
final class ProblemSupport {

	private ProblemSupport() {}

	/** Returns a fresh empty trie root for problems that build their own trie. */
	static TrieNode newRoot() {
		return new TrieNode();
	}
}
