import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	@Test
	void height_emptyTree_isNegativeOne() {
		var tree = new BinaryTree<Integer>();
		assertEquals(-1, tree.height());
	}

	@Test
	void setRoot_thenRoot_notNull() {
		var tree = new BinaryTree<Integer>();
		tree.setRoot(7);
		assertNotNull(tree.root());
	}

	@Test
	void size_singleNode_isOne() {
		var tree = new BinaryTree<Integer>();
		tree.setRoot(7);
		assertEquals(1, tree.size());
	}

	@Test
	void inorder_singleNode_returnsThatValue() {
		var tree = new BinaryTree<Integer>();
		tree.setRoot(7);
		assertEquals(List.of(7), tree.inorder());
	}

	@Test
	void levelOrder_singleNode_returnsOneLevel() {
		var tree = new BinaryTree<Integer>();
		tree.setRoot(7);
		assertEquals(List.of(List.of(7)), tree.levelOrder());
	}
}
