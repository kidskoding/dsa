import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RecursionDeepTest {

	@Test
	void factorial_smallValue_returnsProduct() {
		assertEquals(120L, new RecursionDeep().factorial(5));
	}

	@Test
	void factorial_zero_returnsOne() {
		assertEquals(1L, new RecursionDeep().factorial(0));
	}

	@Test
	void fibonacci_index_returnsExpected() {
		assertEquals(13L, new RecursionDeep().fibonacci(7));
	}

	@Test
	void fibonacci_baseCases_returnSeed() {
		var sut = new RecursionDeep();
		assertEquals(0L, sut.fibonacci(0));
		assertEquals(1L, sut.fibonacci(1));
	}

	@Test
	void sumToN_positive_returnsTriangularNumber() {
		assertEquals(55L, new RecursionDeep().sumToN(10));
	}

	@Test
	void sumToN_zeroOrNegative_returnsZero() {
		var sut = new RecursionDeep();
		assertEquals(0L, sut.sumToN(0));
		assertEquals(0L, sut.sumToN(-4));
	}
}
