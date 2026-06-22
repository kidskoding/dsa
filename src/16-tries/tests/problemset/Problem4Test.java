import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem4Test {

	private final Problem4 sut = new Problem4();

	@Test
	void deletedKeyIsGone() {
		String[] ops = {"insert apple", "delete apple", "search apple"};
		assertArrayEquals(new String[] {"false"}, sut.run(ops));
	}

	@Test
	void deleteKeepsSharedPrefixKey() {
		String[] ops = {"insert app", "insert apple", "delete apple", "search app"};
		assertArrayEquals(new String[] {"true"}, sut.run(ops));
	}

	@Test
	void deletingMissingKeyIsNoOp() {
		String[] ops = {"insert cat", "delete dog", "search cat"};
		assertArrayEquals(new String[] {"true"}, sut.run(ops));
	}
}
