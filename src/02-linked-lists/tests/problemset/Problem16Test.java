import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem16Test {

	@Test
	void sort_unorderedList() {
		var r = new Problem16().sort(Problem01Test.of(4, 2, 1, 3));
		assertArrayEquals(new int[] {1, 2, 3, 4}, Problem01Test.toArray(r));
	}

	@Test
	void sort_withDuplicates() {
		var r = new Problem16().sort(Problem01Test.of(3, 1, 2, 1, 3));
		assertArrayEquals(new int[] {1, 1, 2, 3, 3}, Problem01Test.toArray(r));
	}

	@Test
	void sort_empty() {
		assertNull(new Problem16().sort(null));
	}
}
