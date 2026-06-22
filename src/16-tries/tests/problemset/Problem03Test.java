import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void countsKeysUnderPrefix() {
		Problem03 p = new Problem03();
		p.insert("apple");
		p.insert("appliance");
		p.insert("apply");
		p.insert("banana");
		assertEquals(3, p.countWordsWithPrefix("app"));
	}

	@Test
	void emptyTrieCountsZero() {
		Problem03 p = new Problem03();
		assertEquals(0, p.countWordsWithPrefix("a"));
	}

	@Test
	void duplicateInsertCountedOnce() {
		Problem03 p = new Problem03();
		p.insert("dup");
		p.insert("dup");
		assertEquals(1, p.countWordsWithPrefix("dup"));
	}

	@Test
	void emptyPrefixCountsAll() {
		Problem03 p = new Problem03();
		p.insert("a");
		p.insert("b");
		assertEquals(2, p.countWordsWithPrefix(""));
	}
}
