import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem24Test {

	@Test
	void subtree_present() {
		var sub = new TreeNode<>(4, new TreeNode<>(1), new TreeNode<>(2));
		var root = new TreeNode<>(3, sub, new TreeNode<>(5));
		var candidate = new TreeNode<>(4, new TreeNode<>(1), new TreeNode<>(2));
		assertTrue(new Problem24().isSubtree(root, candidate));
	}

	@Test
	void subtree_extraNodeMismatch() {
		var sub = new TreeNode<>(4, new TreeNode<>(1), new TreeNode<>(2, new TreeNode<>(0), null));
		var root = new TreeNode<>(3, sub, new TreeNode<>(5));
		var candidate = new TreeNode<>(4, new TreeNode<>(1), new TreeNode<>(2));
		assertFalse(new Problem24().isSubtree(root, candidate));
	}

	@Test
	void subtree_singleNodeMatch() {
		var root = new TreeNode<>(1, new TreeNode<>(1), null);
		assertTrue(new Problem24().isSubtree(root, new TreeNode<>(1)));
	}
}
