import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem24Test {

	private final Problem24 sut = new Problem24();

	@Test
	void findNumberOfLIS_basic() {
		assertEquals(2, sut.findNumberOfLIS(new int[] {1, 3, 5, 4, 7}));
	}

	@Test
	void findNumberOfLIS_allEqual() {
		assertEquals(5, sut.findNumberOfLIS(new int[] {2, 2, 2, 2, 2}));
	}

	@Test
	void findNumberOfLIS_longer() {
		assertEquals(3, sut.findNumberOfLIS(new int[] {1, 2, 4, 3, 5, 4, 7, 2}));
	}
}
