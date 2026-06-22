import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem9Test {

	@Test
	void intersection_single() {
		var sut = new Problem9();
		assertArrayEquals(new int[] {2}, sut.intersection(new int[] {1, 2, 2, 1}, new int[] {2, 2}));
	}

	@Test
	void intersection_sorted() {
		var sut = new Problem9();
		assertArrayEquals(
				new int[] {4, 9}, sut.intersection(new int[] {4, 9, 5}, new int[] {9, 4, 9, 8, 4}));
	}

	@Test
	void intersection_empty() {
		var sut = new Problem9();
		assertArrayEquals(new int[] {}, sut.intersection(new int[] {1, 2, 3}, new int[] {4, 5, 6}));
	}
}
