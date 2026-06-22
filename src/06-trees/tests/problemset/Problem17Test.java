import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem17Test {

	private TreeNode<Integer> bst() {
		var left = new TreeNode<>(5, new TreeNode<>(3), new TreeNode<>(7));
		var right = new TreeNode<>(15, null, new TreeNode<>(18));
		return new TreeNode<>(10, left, right);
	}

	@Test
	void rangeSum_window() {
		assertEquals(32, new Problem17().rangeSum(bst(), 7, 15));
	}

	@Test
	void rangeSum_emptyWindow() {
		assertEquals(0, new Problem17().rangeSum(bst(), 20, 30));
	}

	@Test
	void rangeSum_singleNodeOutOfRange() {
		assertEquals(0, new Problem17().rangeSum(new TreeNode<>(5), 1, 4));
	}
}
