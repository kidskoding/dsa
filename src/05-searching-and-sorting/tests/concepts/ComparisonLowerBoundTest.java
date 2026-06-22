import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ComparisonLowerBoundTest {

	private final ComparisonLowerBound sut = new ComparisonLowerBound();

	@Test
	void minComparisons_zeroOrOneElement_isZero() {
		assertEquals(0, sut.minComparisonsToSort(0));
		assertEquals(0, sut.minComparisonsToSort(1));
	}

	@Test
	void minComparisons_twoElements_isOne() {
		// ceil(log2(2!)) = ceil(log2(2)) = 1
		assertEquals(1, sut.minComparisonsToSort(2));
	}

	@Test
	void minComparisons_threeElements_isThree() {
		// ceil(log2(3!)) = ceil(log2(6)) = 3
		assertEquals(3, sut.minComparisonsToSort(3));
	}

	@Test
	void minComparisons_fourElements_isFive() {
		// ceil(log2(4!)) = ceil(log2(24)) = 5
		assertEquals(5, sut.minComparisonsToSort(4));
	}

	@Test
	void minComparisons_tenElements_isTwentyTwo() {
		// ceil(log2(10!)) = ceil(log2(3628800)) = 22
		assertEquals(22, sut.minComparisonsToSort(10));
	}
}
