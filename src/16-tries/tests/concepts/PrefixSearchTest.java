import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class PrefixSearchTest {

	private static PrefixSearch withWords(String... words) {
		PrefixSearch trie = new PrefixSearch();
		for (String w : words) {
			trie.insert(w);
		}
		return trie;
	}

	@Test
	void startsWithMatchesPrefix() {
		PrefixSearch trie = withWords("apple", "appliance", "apply");
		assertTrue(trie.startsWith("app"));
		assertFalse(trie.startsWith("bp"));
	}

	@Test
	void countsWordsUnderPrefix() {
		PrefixSearch trie = withWords("apple", "appliance", "apply", "banana");
		assertEquals(3, trie.countWordsWithPrefix("app"));
		assertEquals(1, trie.countWordsWithPrefix("ban"));
	}

	@Test
	void wordsWithPrefixReturnsAllMatches() {
		PrefixSearch trie = withWords("car", "card", "care", "dog");
		List<String> matches = trie.wordsWithPrefix("car");
		assertEquals(3, matches.size());
		assertTrue(matches.containsAll(List.of("car", "card", "care")));
	}

	@Test
	void emptyTrieCountsZero() {
		PrefixSearch trie = new PrefixSearch();
		assertEquals(0, trie.countWordsWithPrefix("a"));
		assertTrue(trie.wordsWithPrefix("a").isEmpty());
	}

	@Test
	void emptyPrefixMatchesEverything() {
		PrefixSearch trie = withWords("a", "b", "c");
		assertEquals(3, trie.countWordsWithPrefix(""));
	}

	@Test
	void duplicateInsertCountedOnce() {
		PrefixSearch trie = withWords("dup", "dup");
		assertEquals(1, trie.countWordsWithPrefix("dup"));
	}

	@Test
	void prefixThatIsNotAWord() {
		PrefixSearch trie = withWords("testing");
		assertTrue(trie.startsWith("test"));
		assertFalse(trie.contains("test"));
	}
}
