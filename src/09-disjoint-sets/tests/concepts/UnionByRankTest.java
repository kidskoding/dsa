import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UnionByRankTest {

	@Test
	void freshElementsHaveRankZero() {
		var ubr = new UnionByRank(4);
		assertEquals(0, ubr.rankOf(0));
	}

	@Test
	void union_mergesElements() {
		var ubr = new UnionByRank(4);
		ubr.union(0, 1);
		assertTrue(ubr.connected(0, 1));
		assertFalse(ubr.connected(0, 2));
	}

	@Test
	void unionOfEqualRanks_incrementsRootRank() {
		var ubr = new UnionByRank(2);
		ubr.union(0, 1);
		// Two rank-0 singletons merge into a tree of rank 1.
		assertEquals(1, ubr.rankOf(ubr.find(0)));
	}

	@Test
	void rankStaysWithinLogBound() {
		var ubr = new UnionByRank(4);
		ubr.union(0, 1);
		ubr.union(2, 3);
		ubr.union(0, 2);
		// A 4-node tree must have root rank at most floor(log2 4) = 2.
		assertTrue(ubr.rankOf(ubr.find(0)) <= 2);
		assertTrue(ubr.connected(1, 3));
	}
}
