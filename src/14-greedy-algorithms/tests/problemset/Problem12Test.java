import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void minPenalty_dropsCheapestConflictingTask() {
		var sut = new Problem12();
		// Two tasks both due at slot 1; the cheaper penalty (10) must be late.
		int[] deadlines = {1, 1};
		int[] penalties = {10, 20};
		assertEquals(10L, sut.minPenalty(deadlines, penalties));
	}

	@Test
	void minPenalty_allFitNoPenalty() {
		var sut = new Problem12();
		int[] deadlines = {1, 2, 3};
		int[] penalties = {5, 6, 7};
		assertEquals(0L, sut.minPenalty(deadlines, penalties));
	}
}
