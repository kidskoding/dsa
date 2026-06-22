import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	private final Problem14 sut = new Problem14();

	@Test
	void prefixTallies() {
		String[] lines = {"apple", "app", "apricot", "---", "ap", "app", "b"};
		assertArrayEquals(new String[] {"3", "2", "0"}, sut.run(lines));
	}

	@Test
	void prefixesOfSingleWord() {
		String[] lines = {"dog", "---", "do", "dog", "dogs"};
		assertArrayEquals(new String[] {"1", "1", "0"}, sut.run(lines));
	}

	@Test
	void duplicateWordsCounted() {
		String[] lines = {"cat", "cat", "car", "---", "ca", "cat"};
		assertArrayEquals(new String[] {"3", "2"}, sut.run(lines));
	}
}
