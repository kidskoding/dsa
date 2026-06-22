import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void pathSum_exists() {
		// 5 -> 4 -> 11 -> 2 = 22
		var deep = new TreeNode<>(11, new TreeNode<>(7), new TreeNode<>(2));
		var left = new TreeNode<>(4, deep, null);
		var right = new TreeNode<>(8, new TreeNode<>(13), new TreeNode<>(4));
		var root = new TreeNode<>(5, left, right);
		assertTrue(new Problem13().hasPathSum(root, 22));
	}

	@Test
	void pathSum_absent() {
		var root = new TreeNode<>(1, new TreeNode<>(2), new TreeNode<>(3));
		assertFalse(new Problem13().hasPathSum(root, 5));
	}

	@Test
	void pathSum_emptyTree() {
		assertFalse(new Problem13().hasPathSum(null, 0));
	}
}
