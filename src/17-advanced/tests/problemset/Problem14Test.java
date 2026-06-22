import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	private final Problem14 sut = new Problem14();

	@Test
	void countSmaller_basic() {
		assertArrayEquals(new int[] {2, 1, 1, 0}, sut.countSmaller(new int[] {5, 2, 6, 1}));
	}

	@Test
	void countSmaller_duplicates() {
		assertArrayEquals(new int[] {3, 1, 1, 1, 0}, sut.countSmaller(new int[] {3, 2, 2, 6, 1}));
	}
}
