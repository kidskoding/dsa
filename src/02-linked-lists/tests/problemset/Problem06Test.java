import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem06Test {

	@Test
	void deleteDuplicates_withRuns() {
		var r = new Problem06().deleteDuplicates(Problem01Test.of(1, 1, 2, 3, 3));
		assertArrayEquals(new int[] {1, 2, 3}, Problem01Test.toArray(r));
	}

	@Test
	void deleteDuplicates_noDuplicates() {
		var r = new Problem06().deleteDuplicates(Problem01Test.of(1, 2, 3));
		assertArrayEquals(new int[] {1, 2, 3}, Problem01Test.toArray(r));
	}

	@Test
	void deleteDuplicates_empty() {
		assertNull(new Problem06().deleteDuplicates(null));
	}
}
