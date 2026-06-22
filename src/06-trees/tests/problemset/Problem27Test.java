import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem27Test {

	@Test
	void maxPathSum_throughRoot() {
		var root = new TreeNode<>(1, new TreeNode<>(2), new TreeNode<>(3));
		assertEquals(6L, new Problem27().maxPathSum(root));
	}

	@Test
	void maxPathSum_skipsNegativeRoot() {
		var right = new TreeNode<>(20, new TreeNode<>(15), new TreeNode<>(7));
		var root = new TreeNode<>(-10, new TreeNode<>(9), right);
		assertEquals(42L, new Problem27().maxPathSum(root));
	}

	@Test
	void maxPathSum_singleNegativeNode() {
		assertEquals(-3L, new Problem27().maxPathSum(new TreeNode<>(-3)));
	}
}
