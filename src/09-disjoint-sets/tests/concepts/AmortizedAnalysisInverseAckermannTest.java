import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AmortizedAnalysisInverseAckermannTest {

	@Test
	void union_mergesElements() {
		var ds = new AmortizedAnalysisInverseAckermann(4);
		ds.union(0, 1);
		assertTrue(ds.connected(0, 1));
	}

	@Test
	void find_isStableAcrossManyMerges() {
		var ds = new AmortizedAnalysisInverseAckermann(6);
		ds.union(0, 1);
		ds.union(2, 3);
		ds.union(1, 2);
		assertEquals(ds.find(0), ds.find(3));
	}

	@Test
	void ackermann_smallArguments() {
		var ds = new AmortizedAnalysisInverseAckermann(1);
		// A(0, n) = n + 1, A(1, 1) = 3, A(2, 2) = 7, A(3, 3) = 61.
		assertEquals(4L, ds.ackermann(0, 3));
		assertEquals(3L, ds.ackermann(1, 1));
		assertEquals(7L, ds.ackermann(2, 2));
		assertEquals(61L, ds.ackermann(3, 3));
	}

	@Test
	void inverseAckermann_staysTinyForLargeN() {
		var ds = new AmortizedAnalysisInverseAckermann(1);
		assertTrue(ds.inverseAckermann(1_000_000L) <= 4);
	}
}
