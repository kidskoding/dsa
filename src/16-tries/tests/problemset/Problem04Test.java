import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void deleteRemovesKey() {
		Problem04 p = new Problem04();
		p.insert("apple");
		assertTrue(p.delete("apple"));
		assertFalse(p.search("apple"));
	}

	@Test
	void deleteKeepsSharedPrefixKeys() {
		Problem04 p = new Problem04();
		p.insert("app");
		p.insert("apple");
		assertTrue(p.delete("apple"));
		assertTrue(p.search("app"));
	}

	@Test
	void deleteMissingKeyReturnsFalse() {
		Problem04 p = new Problem04();
		p.insert("cat");
		assertFalse(p.delete("dog"));
	}

	@Test
	void deleteFromEmptyTrie() {
		Problem04 p = new Problem04();
		assertFalse(p.delete("x"));
	}
}
