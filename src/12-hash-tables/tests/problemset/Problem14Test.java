import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void subarraySum_countsMatchingSubarrays() {
		var sut = new Problem14();
		assertEquals(2, sut.subarraySum(new int[] {1, 1, 1}, 2));
	}

	@Test
	void subarraySum_withNegatives() {
		var sut = new Problem14();
		assertEquals(2, sut.subarraySum(new int[] {1, -1, 0}, 0));
	}
}
