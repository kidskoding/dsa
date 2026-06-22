import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem6Test {

	private final Problem6 sut = new Problem6();

	@Test
	void insertSearchStartsWithFlow() {
		String[] ops = {
			"insert apple", "search apple", "search app", "startsWith app", "insert app", "search app"
		};
		assertArrayEquals(new String[] {"true", "false", "true", "true"}, sut.run(ops));
	}

	@Test
	void prefixAppearsAfterInsert() {
		String[] ops = {"startsWith a", "insert a", "search a", "startsWith a"};
		assertArrayEquals(new String[] {"false", "true", "true"}, sut.run(ops));
	}

	@Test
	void prefixIsNotAKey() {
		String[] ops = {"insert trie", "startsWith tri", "search tri"};
		assertArrayEquals(new String[] {"true", "false"}, sut.run(ops));
	}
}
