import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void minWeightedCompletionTime_ordersBySmithRatio() {
		var sut = new Problem04();
		// Optimal order is job1 (ratio 10) then job0 (ratio 1.5):
		// completion 1*10 + (1+4)*3 = 10 + 15 = 25.
		int[] weights = {3, 10};
		int[] durations = {2, 1};
		assertEquals(25L, sut.minWeightedCompletionTime(weights, durations));
	}

	@Test
	void minWeightedCompletionTime_singleJob_isWeightTimesDuration() {
		var sut = new Problem04();
		assertEquals(15L, sut.minWeightedCompletionTime(new int[] {5}, new int[] {3}));
	}
}
