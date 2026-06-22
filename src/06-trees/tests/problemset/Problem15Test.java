import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	@Test
	void leftLeaves_twoLeaves() {
		var right = new TreeNode<>(20, new TreeNode<>(15), new TreeNode<>(7));
		var root = new TreeNode<>(3, new TreeNode<>(9), right);
		assertEquals(24, new Problem15().sumOfLeftLeaves(root));
	}

	@Test
	void leftLeaves_rootIsNotLeftChild() {
		assertEquals(0, new Problem15().sumOfLeftLeaves(new TreeNode<>(1)));
	}

	@Test
	void leftLeaves_singleLeftLeaf() {
		var left = new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5));
		var root = new TreeNode<>(1, left, new TreeNode<>(3));
		assertEquals(4, new Problem15().sumOfLeftLeaves(root));
	}
}
