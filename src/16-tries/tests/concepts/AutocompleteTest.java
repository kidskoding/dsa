import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class AutocompleteTest {

	@Test
	void topCompletionsRankedByWeight() {
		Autocomplete ac = new Autocomplete();
		ac.insert("cat", 5);
		ac.insert("car", 10);
		ac.insert("care", 3);
		assertEquals(List.of("car", "cat"), ac.topCompletions("ca", 2));
	}

	@Test
	void tiesBrokenLexicographically() {
		Autocomplete ac = new Autocomplete();
		ac.insert("bee", 4);
		ac.insert("bad", 4);
		assertEquals(List.of("bad", "bee"), ac.topCompletions("b", 2));
	}

	@Test
	void kLargerThanMatchesReturnsAll() {
		Autocomplete ac = new Autocomplete();
		ac.insert("apple", 1);
		assertEquals(List.of("apple"), ac.topCompletions("app", 10));
	}

	@Test
	void startsWithReflectsInsertions() {
		Autocomplete ac = new Autocomplete();
		ac.insert("dog", 1);
		assertTrue(ac.startsWith("do"));
		assertFalse(ac.startsWith("ca"));
	}

	@Test
	void emptyEngineReturnsNoCompletions() {
		Autocomplete ac = new Autocomplete();
		assertTrue(ac.topCompletions("x", 3).isEmpty());
		assertTrue(ac.wordsWithPrefix("x").isEmpty());
	}

	@Test
	void reinsertUpdatesWeight() {
		Autocomplete ac = new Autocomplete();
		ac.insert("a", 1);
		ac.insert("ab", 2);
		ac.insert("a", 5);
		assertEquals(List.of("a", "ab"), ac.topCompletions("a", 2));
	}

	@Test
	void emptyPrefixCompletesAll() {
		Autocomplete ac = new Autocomplete();
		ac.insert("z", 1);
		ac.insert("y", 2);
		assertEquals(2, ac.wordsWithPrefix("").size());
	}
}
