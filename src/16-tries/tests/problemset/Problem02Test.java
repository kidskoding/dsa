import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void prefixOfInsertedKeyExists() {
		Problem02 p = new Problem02();
		p.insert("apple");
		assertTrue(p.startsWith("app"));
	}

	@Test
	void unrelatedPrefixIsAbsent() {
		Problem02 p = new Problem02();
		p.insert("apple");
		assertFalse(p.startsWith("banana"));
	}

	@Test
	void emptyTrieHasNoPrefix() {
		Problem02 p = new Problem02();
		assertFalse(p.startsWith("a"));
	}

	@Test
	void fullWordIsAlsoAPrefix() {
		Problem02 p = new Problem02();
		p.insert("apple");
		assertTrue(p.startsWith("apple"));
	}
}
