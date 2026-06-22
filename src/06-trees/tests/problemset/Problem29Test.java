import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem29Test {

	@Test
	void rangeTally_window() {
		var left = new TreeNode<>(5, new TreeNode<>(3), new TreeNode<>(7));
		var right = new TreeNode<>(15, null, new TreeNode<>(18));
		var root = new TreeNode<>(10, left, right);
		assertEquals(32L, new Problem29().rangeTally(root, 7, 15));
	}

	@Test
	void rangeTally_outsideWindow() {
		var root = new TreeNode<>(10, new TreeNode<>(5), new TreeNode<>(15));
		assertEquals(0L, new Problem29().rangeTally(root, 20, 30));
	}

	@Test
	void rangeTally_emptyTree() {
		assertEquals(0L, new Problem29().rangeTally(null, 1, 100));
	}
}
