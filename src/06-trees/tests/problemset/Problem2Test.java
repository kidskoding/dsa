import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem2Test {

	@Test
	void count_emptyTree_isZero() {
		assertEquals(0, new Problem2().count(null));
	}

	@Test
	void count_threeNodes() {
		var root = new TreeNode<>(1, new TreeNode<>(2), new TreeNode<>(3));
		assertEquals(3, new Problem2().count(root));
	}

	@Test
	void count_fiveNodes() {
		var left = new TreeNode<>(2, new TreeNode<>(4), null);
		var right = new TreeNode<>(3, null, new TreeNode<>(5));
		assertEquals(5, new Problem2().count(new TreeNode<>(1, left, right)));
	}
}
