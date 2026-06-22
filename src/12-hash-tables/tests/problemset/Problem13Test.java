import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void anagramGroups_three() {
		var sut = new Problem13();
		assertEquals(3, sut.countAnagramGroups(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
	}

	@Test
	void anagramGroups_emptyWord() {
		var sut = new Problem13();
		assertEquals(1, sut.countAnagramGroups(new String[] {""}));
	}

	@Test
	void anagramGroups_allDistinct() {
		var sut = new Problem13();
		assertEquals(3, sut.countAnagramGroups(new String[] {"a", "b", "c"}));
	}
}
