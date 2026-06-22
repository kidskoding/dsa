import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class RedBlackTreeTest {

	@Test
	void search_emptyTree_returnsFalse() {
		var tree = new RedBlackTree<Integer>();
		assertFalse(tree.search(1));
	}

	@Test
	void insert_thenSearch_findsKey() {
		var tree = new RedBlackTree<Integer>();
		tree.insert(15);
		assertTrue(tree.search(15));
	}

	@Test
	void inorder_afterInserts_isSorted() {
		var tree = new RedBlackTree<Integer>();
		for (int k : new int[] {7, 3, 18, 10, 22, 8, 11, 26}) {
			tree.insert(k);
		}
		assertEquals(List.of(3, 7, 8, 10, 11, 18, 22, 26), tree.inorder());
	}

	@Test
	void insert_ascendingSequence_heightStaysLogarithmic() {
		var tree = new RedBlackTree<Integer>();
		for (int k = 1; k <= 15; k++) {
			tree.insert(k);
		}
		// h <= 2*lg(n+1) = 2*4 = 8 for n=15; a linked list would be 14.
		assertTrue(tree.height() <= 8);
	}

	@Test
	void delete_existingKey_removesIt() {
		var tree = new RedBlackTree<Integer>();
		for (int k : new int[] {7, 3, 18, 10}) {
			tree.insert(k);
		}
		tree.delete(7);
		assertFalse(tree.search(7));
	}

	@Test
	void height_emptyTree_isNegativeOne() {
		var tree = new RedBlackTree<Integer>();
		assertEquals(-1, tree.height());
	}
}
