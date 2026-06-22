import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UnionFindTest {

	@Test
	void freshUniverse_eachElementIsItsOwnSet() {
		var uf = new UnionFind(5);
		assertEquals(5, uf.count());
		assertFalse(uf.connected(0, 1));
	}

	@Test
	void union_mergesTwoElements() {
		var uf = new UnionFind(5);
		uf.union(0, 1);
		assertTrue(uf.connected(0, 1));
		assertEquals(4, uf.count());
	}

	@Test
	void union_isTransitiveAcrossChainedMerges() {
		var uf = new UnionFind(5);
		uf.union(0, 1);
		uf.union(1, 2);
		assertTrue(uf.connected(0, 2));
		assertFalse(uf.connected(0, 3));
	}

	@Test
	void elementIsConnectedToItself() {
		var uf = new UnionFind(3);
		assertTrue(uf.connected(2, 2));
	}

	@Test
	void redundantUnion_doesNotChangeSetCount() {
		var uf = new UnionFind(3);
		uf.union(0, 1);
		uf.union(0, 1);
		assertEquals(2, uf.count());
	}

	@Test
	void makeSet_growsTheUniverse() {
		var uf = new UnionFind(1);
		uf.makeSet(3);
		assertFalse(uf.connected(0, 3));
	}
}
