import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	private TreeNode<Integer> sampleBst() {
		var left = new TreeNode<>(3, new TreeNode<>(1), new TreeNode<>(4));
		var right = new TreeNode<>(8, new TreeNode<>(7), new TreeNode<>(9));
		return new TreeNode<>(5, left, right);
	}

	@Test
	void lowestCommonAncestor_splitAcrossRoot_returnsRoot() {
		assertEquals(5, new Problem11().lowestCommonAncestor(sampleBst(), 1, 9));
	}

	@Test
	void lowestCommonAncestor_bothInLeftSubtree_returnsSubtreeRoot() {
		assertEquals(3, new Problem11().lowestCommonAncestor(sampleBst(), 1, 4));
	}
}
