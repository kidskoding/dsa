import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem10Test {

	@Test
	void shortestPeriod_repeated_returnsUnitLength() {
		assertEquals(2, new Problem10().shortestPeriod("abababab"));
	}

	@Test
	void shortestPeriod_partialRepeat_returnsPrefixLength() {
		assertEquals(3, new Problem10().shortestPeriod("abcabca"));
	}

	@Test
	void shortestPeriod_aperiodic_returnsFullLength() {
		assertEquals(5, new Problem10().shortestPeriod("abcde"));
	}
}
