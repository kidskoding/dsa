import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem04Test {

	private final Problem04 sut = new Problem04();

	@Test
	void sortColors_mixed_groupsInOrder() {
		int[] a = {2, 0, 2, 1, 1, 0};
		sut.sortColors(a);
		assertArrayEquals(new int[] {0, 0, 1, 1, 2, 2}, a);
	}

	@Test
	void sortColors_alreadySorted_isUnchanged() {
		int[] a = {0, 0, 1, 2, 2};
		sut.sortColors(a);
		assertArrayEquals(new int[] {0, 0, 1, 2, 2}, a);
	}

	@Test
	void sortColors_singleValue_isUnchanged() {
		int[] a = {1, 1, 1};
		sut.sortColors(a);
		assertArrayEquals(new int[] {1, 1, 1}, a);
	}

	@Test
	void sortColors_empty_staysEmpty() {
		int[] a = {};
		sut.sortColors(a);
		assertArrayEquals(new int[] {}, a);
	}
}
