import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem2Test {

	private final Problem2 sut = new Problem2();

	@Test
	void power_twoToTen() {
		assertEquals(1024L, sut.power(2, 10));
	}

	@Test
	void power_exponentZero() {
		assertEquals(1L, sut.power(5, 0));
	}

	@Test
	void power_threeCubed() {
		assertEquals(27L, sut.power(3, 3));
	}
}
