import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem8Test {

	private final Problem8 sut = new Problem8();

	@Test
	void fib_two() {
		assertEquals(1, sut.fib(2));
	}

	@Test
	void fib_four() {
		assertEquals(3, sut.fib(4));
	}

	@Test
	void fib_ten() {
		assertEquals(55, sut.fib(10));
	}
}
