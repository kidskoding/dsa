import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem26Test {

	private TreeNode<Integer> tree() {
		// 3 (5 (6, 2 (7,4)), 1 (0,8))
		var leftRight = new TreeNode<>(2, new TreeNode<>(7), new TreeNode<>(4));
		var left = new TreeNode<>(5, new TreeNode<>(6), leftRight);
		var right = new TreeNode<>(1, new TreeNode<>(0), new TreeNode<>(8));
		return new TreeNode<>(3, left, right);
	}

	@Test
	void lca_acrossSubtrees() {
		assertEquals(3, new Problem26().lowestCommonAncestor(tree(), 5, 1));
	}

	@Test
	void lca_ancestorOfItself() {
		assertEquals(5, new Problem26().lowestCommonAncestor(tree(), 5, 4));
	}

	@Test
	void lca_parentChild() {
		var root = new TreeNode<>(1, new TreeNode<>(2), null);
		assertEquals(1, new Problem26().lowestCommonAncestor(root, 1, 2));
	}
}
