import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem04Test {

	private final Problem04 sut = new Problem04();

	@Test
	void minWeightedCompletion_singleJob() {
		assertEquals(50L, sut.minWeightedCompletion(new int[] {10}, new int[] {5}));
	}

	@Test
	void minWeightedCompletion_shorterFirst() {
		assertEquals(4L, sut.minWeightedCompletion(new int[] {1, 1}, new int[] {1, 2}));
	}

	@Test
	void minWeightedCompletion_byRatio() {
		assertEquals(10L, sut.minWeightedCompletion(new int[] {3, 1}, new int[] {1, 2}));
	}
}
