import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem26Test {

	private final Problem26 sut = new Problem26();

	@Test
	void maximumGap_basic() {
		assertEquals(3, sut.maximumGap(new int[] {3, 6, 9, 1}));
	}

	@Test
	void maximumGap_single_returnsZero() {
		assertEquals(0, sut.maximumGap(new int[] {10}));
	}

	@Test
	void maximumGap_allEqual_returnsZero() {
		assertEquals(0, sut.maximumGap(new int[] {1, 1, 1}));
	}
}
