import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class BTreeTest {

	@Test
	void constructor_minDegreeBelowTwo_throws() {
		assertThrows(IllegalArgumentException.class, () -> new BTree<Integer>(1));
	}

	@Test
	void search_emptyTree_returnsFalse() {
		var tree = new BTree<Integer>(2);
		assertFalse(tree.search(1));
	}

	@Test
	void insert_thenSearch_findsKey() {
		var tree = new BTree<Integer>(3);
		tree.insert(100);
		assertTrue(tree.search(100));
	}

	@Test
	void inorder_afterInserts_isSorted() {
		var tree = new BTree<Integer>(2);
		for (int k : new int[] {5, 3, 8, 1, 4, 9, 7, 2, 6}) {
			tree.insert(k);
		}
		assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), tree.inorder());
	}

	@Test
	void height_emptyTree_isNegativeOne() {
		var tree = new BTree<Integer>(2);
		assertEquals(-1, tree.height());
	}

	@Test
	void delete_existingKey_removesIt() {
		var tree = new BTree<Integer>(2);
		for (int k : new int[] {5, 3, 8, 1, 4}) {
			tree.insert(k);
		}
		tree.delete(3);
		assertFalse(tree.search(3));
	}
}
