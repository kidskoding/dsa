import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem21Test {

	private final Problem21 p = new Problem21();

	@Test
	void simpleBreak() {
		assertTrue(p.wordBreak("leetcode", List.of("leet", "code")));
	}

	@Test
	void reusedWord() {
		assertTrue(p.wordBreak("applepenapple", List.of("apple", "pen")));
	}

	@Test
	void noSegmentation() {
		assertFalse(p.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
	}
}
