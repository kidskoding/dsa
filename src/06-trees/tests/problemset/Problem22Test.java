import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem22Test {

	@Test
	void countNodes_completeSix() {
		var left = new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5));
		var right = new TreeNode<>(3, new TreeNode<>(6), null);
		assertEquals(6, new Problem22().countNodes(new TreeNode<>(1, left, right)));
	}

	@Test
	void countNodes_emptyTree_isZero() {
		assertEquals(0, new Problem22().countNodes(null));
	}

	@Test
	void countNodes_singleNode() {
		assertEquals(1, new Problem22().countNodes(new TreeNode<>(1)));
	}
}
