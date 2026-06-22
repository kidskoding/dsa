import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem20Test {

	@Test
	void spansAcrossPrices() {
		Problem20 s = new Problem20();
		assertEquals(1, s.next(100));
		assertEquals(1, s.next(80));
		assertEquals(1, s.next(60));
		assertEquals(2, s.next(70));
		assertEquals(1, s.next(60));
		assertEquals(4, s.next(75));
		assertEquals(6, s.next(85));
	}

	@Test
	void monotoneIncreasing() {
		Problem20 s = new Problem20();
		assertEquals(1, s.next(10));
		assertEquals(2, s.next(20));
		assertEquals(3, s.next(30));
	}
}
