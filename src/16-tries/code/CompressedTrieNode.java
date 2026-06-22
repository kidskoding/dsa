import java.util.HashMap;
import java.util.Map;

/**
 * A node in a compressed trie (radix tree).
 *
 * <p>Unlike a standard {@link TrieNode}, edges here are labelled by whole substrings rather than
 * single characters, so a chain of single-child nodes collapses into one edge. Children are keyed
 * by the first character of their edge label for \( O(1) \) dispatch.
 */
public final class CompressedTrieNode {

	/** Child edges keyed by the first character of each edge's label. */
	public final Map<Character, CompressedTrieNode> children = new HashMap<>();

	/** The substring labelling the edge that enters this node from its parent. */
	public String edgeLabel;

	/** True when the path from the root to this node spells a complete inserted key. */
	public boolean isEndOfWord = false;

	/**
	 * Creates a node reached by the given edge label.
	 *
	 * @param edgeLabel the substring labelling the incoming edge (empty for the root)
	 */
	public CompressedTrieNode(String edgeLabel) {
		this.edgeLabel = edgeLabel;
	}
}
