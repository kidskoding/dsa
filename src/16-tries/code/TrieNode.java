import java.util.HashMap;
import java.util.Map;

/**
 * A single node in a standard (uncompressed) trie.
 *
 * <p>Each node maps a character to a child node and records whether the path from the root to this
 * node spells a complete inserted key. This type is shared by the trie implementations in this
 * module.
 */
public final class TrieNode {

	/** Child edges keyed by the single character labelling the edge. */
	public final Map<Character, TrieNode> children = new HashMap<>();

	/** True when the path from the root to this node spells a complete inserted key. */
	public boolean isEndOfWord = false;
}
