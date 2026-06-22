import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void searchFindsInsertedKey() {
		Problem01 p = new Problem01();
		p.insert("apple");
		assertTrue(p.search("apple"));
	}

	@Test
	void prefixIsNotAKey() {
		Problem01 p = new Problem01();
		p.insert("apple");
		assertFalse(p.search("app"));
	}

	@Test
	void emptyTrieFindsNothing() {
		Problem01 p = new Problem01();
		assertFalse(p.search("x"));
	}

	@Test
	void duplicateInsertStillFound() {
		Problem01 p = new Problem01();
		p.insert("cat");
		p.insert("cat");
		assertTrue(p.search("cat"));
	}
}
