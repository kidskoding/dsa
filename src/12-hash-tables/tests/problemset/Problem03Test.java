import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void countAnagramGroups_groupsPermutations() {
		var sut = new Problem03();
		assertEquals(2, sut.countAnagramGroups(new String[] {"eat", "tea", "tan", "ate"}));
	}

	@Test
	void countAnagramGroups_emptyInput_returnsZero() {
		var sut = new Problem03();
		assertEquals(0, sut.countAnagramGroups(new String[] {}));
	}
}
