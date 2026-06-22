import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem10Test {

	private final Problem10 sut = new Problem10();

	@Test
	void buildableChain() {
		assertEquals("world", sut.run(new String[] {"w", "wo", "wor", "worl", "world"}));
	}

	@Test
	void tieBrokenLexicographically() {
		String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
		assertEquals("apple", sut.run(words));
	}

	@Test
	void shortBuildableWord() {
		assertEquals("yo", sut.run(new String[] {"yo", "ew", "fc", "zsl", "y"}));
	}
}
