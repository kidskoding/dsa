import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	@Test
	void diameter_acrossRoot() {
		var left = new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5));
		var root = new TreeNode<>(1, left, new TreeNode<>(3));
		assertEquals(3, new Problem11().diameter(root));
	}

	@Test
	void diameter_twoNodes() {
		var root = new TreeNode<>(1, new TreeNode<>(2), null);
		assertEquals(1, new Problem11().diameter(root));
	}

	@Test
	void diameter_singleNode_isZero() {
		assertEquals(0, new Problem11().diameter(new TreeNode<>(1)));
	}
}
