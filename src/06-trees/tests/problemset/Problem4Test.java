import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem4Test {

	@Test
	void inorder_emptyTree_isEmpty() {
		assertEquals(List.of(), new Problem4().inorder(null));
	}

	@Test
	void inorder_rightChildWithLeft() {
		var root = new TreeNode<>(1, null, new TreeNode<>(2, new TreeNode<>(3), null));
		assertEquals(List.of(1, 3, 2), new Problem4().inorder(root));
	}

	@Test
	void inorder_bstIsSorted() {
		var root = new TreeNode<>(2, new TreeNode<>(1), new TreeNode<>(3));
		assertEquals(List.of(1, 2, 3), new Problem4().inorder(root));
	}
}
