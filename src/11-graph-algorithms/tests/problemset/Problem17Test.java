import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem17Test {

	private final Problem17 sut = new Problem17();

	@Test
	void budgetLimitsCables() {
		int[][] c = {{0, 1, 1}, {1, 2, 2}, {2, 3, 5}};
		assertEquals(3L, sut.maxPoweredStages(4, c, 3L));
	}

	@Test
	void noAffordableCableToGenerator() {
		int[][] c = {{0, 1, 4}};
		assertEquals(1L, sut.maxPoweredStages(3, c, 2L));
	}

	@Test
	void componentDisconnectedFromGenerator() {
		int[][] c = {{1, 2, 1}, {2, 3, 1}};
		assertEquals(1L, sut.maxPoweredStages(4, c, 10L));
	}
}
