import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem10Test {

	@Test
	void symmetric_mirroredTree() {
		var left = new TreeNode<>(2, new TreeNode<>(3), new TreeNode<>(4));
		var right = new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(3));
		assertTrue(new Problem10().isSymmetric(new TreeNode<>(1, left, right)));
	}

	@Test
	void asymmetric_tree() {
		var left = new TreeNode<>(2, null, new TreeNode<>(3));
		var right = new TreeNode<>(2, null, new TreeNode<>(3));
		assertFalse(new Problem10().isSymmetric(new TreeNode<>(1, left, right)));
	}

	@Test
	void symmetric_singleNode() {
		assertTrue(new Problem10().isSymmetric(new TreeNode<>(1)));
	}
}
