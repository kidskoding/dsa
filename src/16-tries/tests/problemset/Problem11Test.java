import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem11Test {

	@Test
	void rankedByFrequency() {
		Problem11 p = new Problem11();
		p.insert("car", 10);
		p.insert("cat", 5);
		p.insert("care", 3);
		assertEquals(List.of("car", "cat"), p.topK("ca", 2));
	}

	@Test
	void tiesBrokenLexicographically() {
		Problem11 p = new Problem11();
		p.insert("bee", 4);
		p.insert("bad", 4);
		assertEquals(List.of("bad", "bee"), p.topK("b", 2));
	}

	@Test
	void kLargerThanMatches() {
		Problem11 p = new Problem11();
		p.insert("apple", 1);
		assertEquals(List.of("apple"), p.topK("app", 5));
	}

	@Test
	void emptyTrieReturnsNothing() {
		Problem11 p = new Problem11();
		assertTrue(p.topK("x", 3).isEmpty());
	}
}
