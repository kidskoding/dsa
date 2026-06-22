import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class SplayTreeTest {

	@Test
	void search_emptyTree_returnsFalse() {
		var tree = new SplayTree<Integer>();
		assertFalse(tree.search(1));
	}

	@Test
	void rootKey_emptyTree_isNull() {
		var tree = new SplayTree<Integer>();
		assertNull(tree.rootKey());
	}

	@Test
	void insert_thenSearch_findsKey() {
		var tree = new SplayTree<Integer>();
		tree.insert(9);
		assertTrue(tree.search(9));
	}

	@Test
	void search_movesAccessedKeyToRoot() {
		var tree = new SplayTree<Integer>();
		for (int k : new int[] {5, 3, 8, 1}) {
			tree.insert(k);
		}
		tree.search(3);
		assertEquals(3, tree.rootKey());
	}

	@Test
	void inorder_afterInserts_isSorted() {
		var tree = new SplayTree<Integer>();
		for (int k : new int[] {5, 3, 8, 1, 4}) {
			tree.insert(k);
		}
		assertEquals(List.of(1, 3, 4, 5, 8), tree.inorder());
	}

	@Test
	void delete_existingKey_removesIt() {
		var tree = new SplayTree<Integer>();
		for (int k : new int[] {5, 3, 8}) {
			tree.insert(k);
		}
		tree.delete(3);
		assertFalse(tree.search(3));
	}
}
