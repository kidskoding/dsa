import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem2Test {

	private final Problem2 sut = new Problem2();

	@Test
	void prefixPresentAndAbsent() {
		String[] ops = {"insert apple", "prefix app", "prefix apx"};
		assertArrayEquals(new String[] {"true", "false"}, sut.run(ops));
	}

	@Test
	void keyCountsAsItsOwnPrefix() {
		String[] ops = {"insert dog", "prefix dog", "prefix do"};
		assertArrayEquals(new String[] {"true", "true"}, sut.run(ops));
	}

	@Test
	void prefixAppearsAfterInsert() {
		String[] ops = {"prefix a", "insert ant", "prefix a"};
		assertArrayEquals(new String[] {"false", "true"}, sut.run(ops));
	}
}
