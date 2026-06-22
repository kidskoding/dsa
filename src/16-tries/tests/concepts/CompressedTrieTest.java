import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class CompressedTrieTest {

	private static CompressedTrie withWords(String... words) {
		CompressedTrie trie = new CompressedTrie();
		for (String w : words) {
			trie.insert(w);
		}
		return trie;
	}

	@Test
	void insertedWordIsFound() {
		CompressedTrie trie = withWords("romane");
		assertTrue(trie.contains("romane"));
	}

	@Test
	void edgeSplitOnDivergingKeys() {
		CompressedTrie trie = withWords("romane", "romanus", "romulus");
		assertTrue(trie.contains("romane"));
		assertTrue(trie.contains("romanus"));
		assertTrue(trie.contains("romulus"));
		assertFalse(trie.contains("roman"));
	}

	@Test
	void prefixSearchSpansPartialEdges() {
		CompressedTrie trie = withWords("romane", "romanus");
		assertTrue(trie.startsWith("roman"));
		assertTrue(trie.startsWith("rom"));
		assertFalse(trie.startsWith("rx"));
	}

	@Test
	void wordsWithPrefixCollectsSubtree() {
		CompressedTrie trie = withWords("romane", "romanus", "romulus");
		List<String> matches = trie.wordsWithPrefix("roman");
		assertEquals(2, matches.size());
		assertTrue(matches.containsAll(List.of("romane", "romanus")));
	}

	@Test
	void emptyTrieFindsNothing() {
		CompressedTrie trie = new CompressedTrie();
		assertFalse(trie.contains("a"));
		assertFalse(trie.startsWith("a"));
		assertTrue(trie.wordsWithPrefix("a").isEmpty());
	}

	@Test
	void emptyStringKey() {
		CompressedTrie trie = withWords("");
		assertTrue(trie.contains(""));
	}

	@Test
	void duplicateInsertIsIdempotent() {
		CompressedTrie trie = withWords("test", "test");
		assertTrue(trie.contains("test"));
		assertEquals(1, trie.wordsWithPrefix("test").size());
	}
}
