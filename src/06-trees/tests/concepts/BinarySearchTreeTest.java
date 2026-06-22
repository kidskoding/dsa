import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

	@Test
	void search_emptyTree_returnsFalse() {
		var bst = new BinarySearchTree<Integer>();
		assertFalse(bst.search(1));
	}

	@Test
	void insert_thenSearch_findsKey() {
		var bst = new BinarySearchTree<Integer>();
		bst.insert(5);
		assertTrue(bst.search(5));
	}

	@Test
	void inorder_afterInserts_isSorted() {
		var bst = new BinarySearchTree<Integer>();
		for (int k : new int[] {5, 3, 8, 1, 4}) {
			bst.insert(k);
		}
		assertEquals(List.of(1, 3, 4, 5, 8), bst.inorder());
	}

	@Test
	void delete_leaf_removesKey() {
		var bst = new BinarySearchTree<Integer>();
		bst.insert(5);
		bst.insert(3);
		bst.delete(3);
		assertFalse(bst.search(3));
	}

	@Test
	void delete_twoChildNode_keepsOrdering() {
		var bst = new BinarySearchTree<Integer>();
		for (int k : new int[] {5, 3, 8, 7, 9}) {
			bst.insert(k);
		}
		bst.delete(8);
		assertEquals(List.of(3, 5, 7, 9), bst.inorder());
	}

	@Test
	void min_emptyTree_isNull() {
		var bst = new BinarySearchTree<Integer>();
		assertNull(bst.min());
	}

	@Test
	void minAndMax_afterInserts_returnExtremes() {
		var bst = new BinarySearchTree<Integer>();
		for (int k : new int[] {5, 3, 8, 1, 9}) {
			bst.insert(k);
		}
		assertEquals(1, bst.min());
		assertEquals(9, bst.max());
	}

	@Test
	void height_emptyTree_isNegativeOne() {
		var bst = new BinarySearchTree<Integer>();
		assertEquals(-1, bst.height());
	}
}
