import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void minDepth_nearestLeaf() {
		var right = new TreeNode<>(20, new TreeNode<>(15), new TreeNode<>(7));
		var root = new TreeNode<>(3, new TreeNode<>(9), right);
		assertEquals(2, new Problem14().minDepth(root));
	}

	@Test
	void minDepth_singleChildChain() {
		// 2 -> 3 -> 4, only leaf at depth 3; single-child nodes are not leaves.
		var root = new TreeNode<>(2, null, new TreeNode<>(3, null, new TreeNode<>(4)));
		assertEquals(3, new Problem14().minDepth(root));
	}

	@Test
	void minDepth_emptyTree_isZero() {
		assertEquals(0, new Problem14().minDepth(null));
	}
}
