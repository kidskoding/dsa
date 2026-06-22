import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem10Test {

	@Test
	void exactMatch() {
		Problem10 p = new Problem10();
		p.insert("bad");
		assertTrue(p.search("bad"));
	}

	@Test
	void wildcardMatchesAnyChar() {
		Problem10 p = new Problem10();
		p.insert("bad");
		assertTrue(p.search("b.d"));
		assertTrue(p.search("..."));
	}

	@Test
	void wildcardRequiresCorrectLength() {
		Problem10 p = new Problem10();
		p.insert("bad");
		assertFalse(p.search("b."));
		assertFalse(p.search("b..."));
	}

	@Test
	void noMatchInEmptyTrie() {
		Problem10 p = new Problem10();
		assertFalse(p.search("..."));
	}
}
