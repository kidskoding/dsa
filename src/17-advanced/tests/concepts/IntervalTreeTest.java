import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class IntervalTreeTest {

	@Test
	void searchOverlap_findsOverlappingInterval() {
		var sut = new IntervalTree();
		sut.insert(new Interval(15, 20));
		sut.insert(new Interval(10, 30));
		assertNotNull(sut.searchOverlap(new Interval(12, 14)));
	}

	@Test
	void stab_pointInsideInterval_returnsTrue() {
		var sut = new IntervalTree();
		sut.insert(new Interval(5, 10));
		assertTrue(sut.stab(7));
		assertFalse(sut.stab(11));
	}

	@Test
	void reportOverlaps_returnsAllOverlapping() {
		var sut = new IntervalTree();
		sut.insert(new Interval(1, 5));
		sut.insert(new Interval(4, 8));
		sut.insert(new Interval(20, 25));
		assertEquals(2, sut.reportOverlaps(new Interval(3, 6)).size());
	}
}
