import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DpParadigmTest {

	private final DpParadigm dp = new DpParadigm();

	@Test
	void baseCases() {
		assertEquals(0L, dp.fibTabulated(0));
		assertEquals(1L, dp.fibTabulated(1));
	}

	@Test
	void smallValues() {
		assertEquals(5L, dp.fibTabulated(5));
		assertEquals(55L, dp.fibTabulated(10));
	}

	@Test
	void allThreeApproachesAgree() {
		for (int n = 0; n <= 15; n++) {
			long expected = dp.fibTabulated(n);
			assertEquals(expected, dp.fibNaive(n));
			assertEquals(expected, dp.fibMemoized(n));
		}
	}

	@Test
	void memoizationHandlesLargerInput() {
		assertEquals(6765L, dp.fibMemoized(20));
	}
}
