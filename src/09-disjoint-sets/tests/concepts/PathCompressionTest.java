import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PathCompressionTest {

	@Test
	void union_mergesElements() {
		var pc = new PathCompression(4);
		pc.union(0, 1);
		assertTrue(pc.connected(0, 1));
		assertFalse(pc.connected(0, 2));
	}

	@Test
	void find_isConsistentAcrossChain() {
		var pc = new PathCompression(4);
		pc.union(0, 1);
		pc.union(1, 2);
		pc.union(2, 3);
		assertEquals(pc.find(0), pc.find(3));
	}

	@Test
	void find_compressesPathToRoot() {
		var pc = new PathCompression(4);
		pc.union(0, 1);
		pc.union(1, 2);
		pc.union(2, 3);
		// After a find, every node on the access path should point at (or near) the root,
		// so the recorded path length collapses to at most one link.
		int deepest = pc.find(3);
		assertEquals(deepest, pc.find(3));
		assertTrue(pc.pathLengthToRoot(3) <= 1);
	}

	@Test
	void singletonHasZeroPathLength() {
		var pc = new PathCompression(2);
		assertEquals(0, pc.pathLengthToRoot(0));
	}
}
