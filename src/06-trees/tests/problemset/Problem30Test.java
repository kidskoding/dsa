import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem30Test {

	@Test
	void boundary_perfectTree() {
		var left = new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5));
		var right = new TreeNode<>(3, new TreeNode<>(6), new TreeNode<>(7));
		var root = new TreeNode<>(1, left, right);
		assertEquals(List.of(1, 2, 4, 5, 6, 7, 3), new Problem30().boundary(root));
	}

	@Test
	void boundary_rightLeaning() {
		// 1 -> right 2 (3, 4)
		var right = new TreeNode<>(2, new TreeNode<>(3), new TreeNode<>(4));
		var root = new TreeNode<>(1, null, right);
		assertEquals(List.of(1, 3, 4, 2), new Problem30().boundary(root));
	}

	@Test
	void boundary_singleNode() {
		assertEquals(List.of(1), new Problem30().boundary(new TreeNode<>(1)));
	}
}
