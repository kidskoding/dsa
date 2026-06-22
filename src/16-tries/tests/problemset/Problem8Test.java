import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem8Test {

	private final Problem8 sut = new Problem8();

	@Test
	void shortestRootReplaces() {
		String[] input = {"the cattle was rattled by the battery", "cat", "bat", "rat"};
		assertEquals("the cat was rat by the bat", sut.run(input));
	}

	@Test
	void singleRootMatchesAll() {
		String[] input = {"a aa a aaaa aaa", "a", "b", "c"};
		assertEquals("a a a a a", sut.run(input));
	}

	@Test
	void noRootLeavesSentenceUnchanged() {
		String[] input = {"hello world", "xyz"};
		assertEquals("hello world", sut.run(input));
	}
}
