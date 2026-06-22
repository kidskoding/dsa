import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void balanced_tree() {
		var right = new TreeNode<>(20, new TreeNode<>(15), new TreeNode<>(7));
		var root = new TreeNode<>(3, new TreeNode<>(9), right);
		assertTrue(new Problem12().isBalanced(root));
	}

	@Test
	void unbalanced_tree() {
		// Left subtree height 2, right subtree empty: differ by more than one at the root's left.
		var deep = new TreeNode<>(2, new TreeNode<>(3, new TreeNode<>(4), null), null);
		var root = new TreeNode<>(1, deep, null);
		assertFalse(new Problem12().isBalanced(root));
	}

	@Test
	void balanced_emptyTree() {
		assertTrue(new Problem12().isBalanced(null));
	}
}
