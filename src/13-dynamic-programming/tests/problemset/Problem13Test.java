import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem13Test {

	private final Problem13 p = new Problem13();

	@Test
	void segmentable() {
		assertTrue(p.canSegment("leetcode", List.of("leet", "code")));
	}

	@Test
	void reusesDictionaryWords() {
		assertTrue(p.canSegment("applepenapple", List.of("apple", "pen")));
	}

	@Test
	void notSegmentable() {
		assertFalse(p.canSegment("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
	}

	@Test
	void emptyStringIsTriviallySegmentable() {
		assertTrue(p.canSegment("", List.of("a")));
	}
}
