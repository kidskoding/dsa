import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem18Test {

	private TreeNode<Integer> bst() {
		var left = new TreeNode<>(2, new TreeNode<>(0), new TreeNode<>(4));
		var right = new TreeNode<>(8, new TreeNode<>(7), new TreeNode<>(9));
		return new TreeNode<>(6, left, right);
	}

	@Test
	void lca_splitAtRoot() {
		assertEquals(6, new Problem18().lowestCommonAncestor(bst(), 2, 8));
	}

	@Test
	void lca_ancestorOfItself() {
		assertEquals(2, new Problem18().lowestCommonAncestor(bst(), 2, 4));
	}

	@Test
	void lca_parentChild() {
		var root = new TreeNode<>(2, new TreeNode<>(1), null);
		assertEquals(2, new Problem18().lowestCommonAncestor(root, 2, 1));
	}
}
