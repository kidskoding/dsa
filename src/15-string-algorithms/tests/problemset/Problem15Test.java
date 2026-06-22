import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	private final Problem15 sut = new Problem15();

	@Test
	void period_partialRepeat() {
		assertEquals(3, sut.shortestPeriod("abcabcab"));
	}

	@Test
	void period_allSame() {
		assertEquals(1, sut.shortestPeriod("aaaa"));
	}

	@Test
	void period_none() {
		assertEquals(4, sut.shortestPeriod("abcd"));
	}
}
