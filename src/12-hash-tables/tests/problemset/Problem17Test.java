import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem17Test {

	@Test
	void longestConsecutive_basic() {
		var sut = new Problem17();
		assertEquals(4, sut.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
	}

	@Test
	void longestConsecutive_withDuplicates() {
		var sut = new Problem17();
		assertEquals(9, sut.longestConsecutive(new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
	}

	@Test
	void longestConsecutive_empty() {
		var sut = new Problem17();
		assertEquals(0, sut.longestConsecutive(new int[] {}));
	}
}
