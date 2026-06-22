import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	@Test
	void findMedian_oddAndEvenCounts() {
		Problem11 m = new Problem11();
		m.addNum(1);
		m.addNum(2);
		assertEquals(1.5, m.findMedian(), 1e-9);
		m.addNum(3);
		assertEquals(2.0, m.findMedian(), 1e-9);
	}

	@Test
	void findMedian_singleElement() {
		Problem11 m = new Problem11();
		m.addNum(5);
		assertEquals(5.0, m.findMedian(), 1e-9);
	}
}
