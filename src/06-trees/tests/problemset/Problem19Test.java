import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem19Test {

	@Test
	void kthSmallest_first() {
		var root = new TreeNode<>(3, new TreeNode<>(1, null, new TreeNode<>(2)), new TreeNode<>(4));
		assertEquals(1, new Problem19().kthSmallest(root, 1));
	}

	@Test
	void kthSmallest_third() {
		var left = new TreeNode<>(3, new TreeNode<>(2, new TreeNode<>(1), null), new TreeNode<>(4));
		var root = new TreeNode<>(5, left, new TreeNode<>(6));
		assertEquals(3, new Problem19().kthSmallest(root, 3));
	}

	@Test
	void kthSmallest_last() {
		var root = new TreeNode<>(2, new TreeNode<>(1), new TreeNode<>(3));
		assertEquals(3, new Problem19().kthSmallest(root, 3));
	}
}
