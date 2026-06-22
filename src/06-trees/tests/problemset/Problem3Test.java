import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem3Test {

	@Test
	void preorder_emptyTree_isEmpty() {
		assertEquals(List.of(), new Problem3().preorder(null));
	}

	@Test
	void preorder_rightChildWithLeft() {
		// 1 -> right 2 -> left 3
		var root = new TreeNode<>(1, null, new TreeNode<>(2, new TreeNode<>(3), null));
		assertEquals(List.of(1, 2, 3), new Problem3().preorder(root));
	}

	@Test
	void preorder_fullTriangle() {
		var root = new TreeNode<>(1, new TreeNode<>(2), new TreeNode<>(3));
		assertEquals(List.of(1, 2, 3), new Problem3().preorder(root));
	}
}
