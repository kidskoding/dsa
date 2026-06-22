import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	private final Problem13 sut = new Problem13();

	@Test
	void topTwoByFrequencyThenLex() {
		String[] input = {"2", "ap", "apple 5", "app 3", "apply 5", "banana 9"};
		assertArrayEquals(new String[] {"apple", "apply"}, sut.run(input));
	}

	@Test
	void allTiesOrderedLexically() {
		String[] input = {"3", "c", "cat 4", "car 4", "cab 4"};
		assertArrayEquals(new String[] {"cab", "car", "cat"}, sut.run(input));
	}

	@Test
	void noMatchReturnsEmpty() {
		String[] input = {"2", "z", "apple 5"};
		assertArrayEquals(new String[] {}, sut.run(input));
	}
}
