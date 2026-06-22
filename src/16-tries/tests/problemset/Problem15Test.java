import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	private final Problem15 sut = new Problem15();

	@Test
	void twoChunkSplit() {
		assertEquals("true", sut.run(new String[] {"abcd", "ab", "cd", "abc"}));
	}

	@Test
	void chunksRepeat() {
		assertEquals("true", sut.run(new String[] {"aaaaa", "aa", "aaa"}));
	}

	@Test
	void noSegmentation() {
		assertEquals("false", sut.run(new String[] {"abcf", "ab", "cd"}));
	}
}
