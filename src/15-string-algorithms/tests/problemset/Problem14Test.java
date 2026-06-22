import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	private final Problem14 sut = new Problem14();

	@Test
	void group_mixed() {
		assertArrayEquals(
				new String[][] {{"eat", "tea", "ate"}, {"tan", "nat"}, {"bat"}},
				sut.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
	}

	@Test
	void group_emptyString() {
		assertArrayEquals(new String[][] {{""}}, sut.groupAnagrams(new String[] {""}));
	}

	@Test
	void group_single() {
		assertArrayEquals(new String[][] {{"a"}}, sut.groupAnagrams(new String[] {"a"}));
	}
}
