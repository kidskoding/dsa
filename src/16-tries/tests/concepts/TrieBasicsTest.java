import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TrieBasicsTest {

	@Test
	void insertedWordIsFound() {
		TrieBasics trie = new TrieBasics();
		trie.insert("apple");
		assertTrue(trie.contains("apple"));
	}

	@Test
	void prefixIsNotAStoredWord() {
		TrieBasics trie = new TrieBasics();
		trie.insert("apple");
		assertFalse(trie.contains("app"));
		assertTrue(trie.startsWith("app"));
	}

	@Test
	void emptyTrieFindsNothing() {
		TrieBasics trie = new TrieBasics();
		assertFalse(trie.contains("anything"));
		assertFalse(trie.startsWith("a"));
	}

	@Test
	void emptyStringKey() {
		TrieBasics trie = new TrieBasics();
		trie.insert("");
		assertTrue(trie.contains(""));
		assertTrue(trie.startsWith(""));
	}

	@Test
	void duplicateInsertKeepsSingleKey() {
		TrieBasics trie = new TrieBasics();
		trie.insert("cat");
		trie.insert("cat");
		assertTrue(trie.contains("cat"));
	}

	@Test
	void missingWordWithSharedPrefix() {
		TrieBasics trie = new TrieBasics();
		trie.insert("car");
		assertFalse(trie.contains("card"));
		assertFalse(trie.startsWith("cab"));
	}
}
