import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem1Test {

	private final Problem1 sut = new Problem1();

	@Test
	void prefixIsNotAKey() {
		String[] ops = {"insert apple", "search apple", "search app"};
		assertArrayEquals(new String[] {"true", "false"}, sut.run(ops));
	}

	@Test
	void searchBeforeInsertMisses() {
		String[] ops = {"search ghost", "insert ghost", "search ghost"};
		assertArrayEquals(new String[] {"false", "true"}, sut.run(ops));
	}

	@Test
	void duplicateInsertStillFound() {
		String[] ops = {"insert cat", "insert cat", "search cat"};
		assertArrayEquals(new String[] {"true"}, sut.run(ops));
	}
}
