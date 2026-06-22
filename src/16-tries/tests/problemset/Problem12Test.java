import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	private final Problem12 sut = new Problem12();

	@Test
	void wildcardMatching() {
		String[] ops = {
			"addWord bad",
			"addWord dad",
			"addWord mad",
			"search pad",
			"search bad",
			"search .ad",
			"search b.."
		};
		assertArrayEquals(new String[] {"false", "true", "true", "true"}, sut.run(ops));
	}

	@Test
	void singleWildcardAndLength() {
		String[] ops = {"addWord a", "search .", "search a", "search aa"};
		assertArrayEquals(new String[] {"true", "true", "false"}, sut.run(ops));
	}

	@Test
	void searchBeforeAddMisses() {
		String[] ops = {"search a", "addWord a", "search a"};
		assertArrayEquals(new String[] {"false", "true"}, sut.run(ops));
	}
}
