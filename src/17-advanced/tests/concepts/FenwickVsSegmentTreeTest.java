import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FenwickVsSegmentTreeTest {

	@Test
	void fenwick_supportsInvertibleAggregates() {
		var sut = new FenwickVsSegmentTree();
		assertTrue(sut.fenwickSupportsRangeQuery(Aggregate.SUM));
		assertTrue(sut.fenwickSupportsRangeQuery(Aggregate.XOR));
	}

	@Test
	void fenwick_rejectsNonInvertibleAggregates() {
		var sut = new FenwickVsSegmentTree();
		assertFalse(sut.fenwickSupportsRangeQuery(Aggregate.MIN));
		assertFalse(sut.fenwickSupportsRangeQuery(Aggregate.GCD));
	}

	@Test
	void segmentTree_supportsAllAssociativeAggregates() {
		var sut = new FenwickVsSegmentTree();
		assertTrue(sut.segmentTreeSupportsRangeQuery(Aggregate.MIN));
		assertTrue(sut.segmentTreeSupportsRangeQuery(Aggregate.SUM));
	}
}
