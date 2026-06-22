import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem7Test {

	@Test
	void maxDepth_threeLevels() {
		var right = new TreeNode<>(20, new TreeNode<>(15), new TreeNode<>(7));
		var root = new TreeNode<>(3, new TreeNode<>(9), right);
		assertEquals(3, new Problem7().maxDepth(root));
	}

	@Test
	void maxDepth_singleChain() {
		var root = new TreeNode<>(1, null, new TreeNode<>(2));
		assertEquals(2, new Problem7().maxDepth(root));
	}

	@Test
	void maxDepth_emptyTree_isZero() {
		assertEquals(0, new Problem7().maxDepth(null));
	}
}
