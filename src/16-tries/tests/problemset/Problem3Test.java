import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem3Test {

	private final Problem3 sut = new Problem3();

	@Test
	void countsAllUnderPrefix() {
		String[] ops = {"insert app", "insert apple", "insert apricot", "count ap"};
		assertArrayEquals(new String[] {"3"}, sut.run(ops));
	}

	@Test
	void deeperPrefixNarrows() {
		String[] ops = {"insert app", "insert apple", "count app", "count appl"};
		assertArrayEquals(new String[] {"2", "1"}, sut.run(ops));
	}

	@Test
	void duplicatesCountedMissingIsZero() {
		String[] ops = {"insert cat", "insert cat", "count cat", "count dog"};
		assertArrayEquals(new String[] {"2", "0"}, sut.run(ops));
	}
}
