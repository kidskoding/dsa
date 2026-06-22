import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem9Test {

	private final Problem9 sut = new Problem9();

	@Test
	void mergeTwoLists_interleaved() {
		assertArrayEquals(
				new int[] {1, 1, 2, 3, 4, 4},
				sut.mergeTwoLists(new int[] {1, 2, 4}, new int[] {1, 3, 4}));
	}

	@Test
	void mergeTwoLists_bothEmpty() {
		assertArrayEquals(new int[] {}, sut.mergeTwoLists(new int[] {}, new int[] {}));
	}

	@Test
	void mergeTwoLists_oneEmpty() {
		assertArrayEquals(new int[] {0}, sut.mergeTwoLists(new int[] {}, new int[] {0}));
	}
}
