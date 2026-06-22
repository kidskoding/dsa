import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void merge_twoNonEmpty() {
		var merged = new Problem04().merge(Problem01Test.of(1, 3, 5), Problem01Test.of(2, 4, 6));
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, Problem01Test.toArray(merged));
	}

	@Test
	void merge_oneEmpty() {
		var merged = new Problem04().merge(null, Problem01Test.of(1, 2));
		assertArrayEquals(new int[] {1, 2}, Problem01Test.toArray(merged));
	}

	@Test
	void merge_bothEmpty() {
		assertNull(new Problem04().merge(null, null));
	}

	@Test
	void merge_withDuplicates() {
		var merged = new Problem04().merge(Problem01Test.of(1, 1), Problem01Test.of(1, 2));
		assertArrayEquals(new int[] {1, 1, 1, 2}, Problem01Test.toArray(merged));
	}
}
