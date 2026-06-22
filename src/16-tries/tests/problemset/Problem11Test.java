import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	private final Problem11 sut = new Problem11();

	@Test
	void simpleSplit() {
		assertEquals("true", sut.run(new String[] {"leetcode", "leet", "code"}));
	}

	@Test
	void wordReused() {
		assertEquals("true", sut.run(new String[] {"applepenapple", "apple", "pen"}));
	}

	@Test
	void noSegmentation() {
		String[] input = {"catsandog", "cats", "dog", "sand", "and", "cat"};
		assertEquals("false", sut.run(input));
	}
}
