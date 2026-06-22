import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class TwoThreeTreeTest {

	@Test
	void search_emptyTree_returnsFalse() {
		var tree = new TwoThreeTree<Integer>();
		assertFalse(tree.search(1));
	}

	@Test
	void insert_thenSearch_findsKey() {
		var tree = new TwoThreeTree<Integer>();
		tree.insert(10);
		assertTrue(tree.search(10));
	}

	@Test
	void inorder_afterInserts_isSorted() {
		var tree = new TwoThreeTree<Integer>();
		for (int k : new int[] {50, 30, 70, 10, 40, 60, 80}) {
			tree.insert(k);
		}
		assertEquals(List.of(10, 30, 40, 50, 60, 70, 80), tree.inorder());
	}

	@Test
	void height_emptyTree_isNegativeOne() {
		var tree = new TwoThreeTree<Integer>();
		assertEquals(-1, tree.height());
	}

	@Test
	void delete_existingKey_removesIt() {
		var tree = new TwoThreeTree<Integer>();
		for (int k : new int[] {50, 30, 70}) {
			tree.insert(k);
		}
		tree.delete(30);
		assertFalse(tree.search(30));
	}
}
