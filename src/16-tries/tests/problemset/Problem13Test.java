import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void segmentableString() {
		Problem13 p = new Problem13();
		assertTrue(p.wordBreak("leetcode", List.of("leet", "code")));
	}

	@Test
	void reusableDictionaryWords() {
		Problem13 p = new Problem13();
		assertTrue(p.wordBreak("applepenapple", List.of("apple", "pen")));
	}

	@Test
	void notSegmentable() {
		Problem13 p = new Problem13();
		assertFalse(p.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
	}

	@Test
	void emptyStringIsTriviallySegmentable() {
		Problem13 p = new Problem13();
		assertTrue(p.wordBreak("", List.of("a")));
	}
}
