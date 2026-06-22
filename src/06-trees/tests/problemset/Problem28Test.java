import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem28Test {

	@Test
	void maxSubtreeSum_wholeTree() {
		var root = new TreeNode<>(1, new TreeNode<>(2), new TreeNode<>(3));
		assertEquals(6L, new Problem28().maxSubtreeSum(root));
	}

	@Test
	void maxSubtreeSum_singleNodeBeatsWhole() {
		var root = new TreeNode<>(-5, new TreeNode<>(4), new TreeNode<>(-8));
		assertEquals(4L, new Problem28().maxSubtreeSum(root));
	}

	@Test
	void maxSubtreeSum_emptyTree_isZero() {
		assertEquals(0L, new Problem28().maxSubtreeSum(null));
	}
}
