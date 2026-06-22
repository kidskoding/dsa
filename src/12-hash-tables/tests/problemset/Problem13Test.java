import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void longestConsecutive_findsRun() {
		var sut = new Problem13();
		assertEquals(4, sut.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
	}

	@Test
	void longestConsecutive_emptyInput_returnsZero() {
		var sut = new Problem13();
		assertEquals(0, sut.longestConsecutive(new int[] {}));
	}
}
