import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class AvlTreeTest {

	@Test
	void search_emptyTree_returnsFalse() {
		var tree = new AvlTree<Integer>();
		assertFalse(tree.search(1));
	}

	@Test
	void insert_thenSearch_findsKey() {
		var tree = new AvlTree<Integer>();
		tree.insert(42);
		assertTrue(tree.search(42));
	}

	@Test
	void insert_ascendingSequence_staysBalanced() {
		var tree = new AvlTree<Integer>();
		for (int k = 1; k <= 7; k++) {
			tree.insert(k);
		}
		// A balanced tree of 7 nodes has height 2, not 6.
		assertEquals(2, tree.height());
		assertTrue(Math.abs(tree.balanceFactor()) <= 1);
	}

	@Test
	void inorder_afterInserts_isSorted() {
		var tree = new AvlTree<Integer>();
		for (int k : new int[] {3, 1, 2, 5, 4}) {
			tree.insert(k);
		}
		assertEquals(List.of(1, 2, 3, 4, 5), tree.inorder());
	}

	@Test
	void delete_existingKey_removesIt() {
		var tree = new AvlTree<Integer>();
		for (int k : new int[] {3, 1, 2, 5, 4}) {
			tree.insert(k);
		}
		tree.delete(3);
		assertFalse(tree.search(3));
		assertTrue(Math.abs(tree.balanceFactor()) <= 1);
	}

	@Test
	void height_emptyTree_isNegativeOne() {
		var tree = new AvlTree<Integer>();
		assertEquals(-1, tree.height());
	}
}
