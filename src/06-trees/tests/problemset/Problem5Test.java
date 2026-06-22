import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem5Test {

	@Test
	void validBst_smallSorted() {
		var root = new TreeNode<>(2, new TreeNode<>(1), new TreeNode<>(3));
		assertTrue(new Problem5().isValidBst(root));
	}

	@Test
	void invalidBst_rightSubtreeViolation() {
		// 5 with right subtree [4,3,6]: node 3 is less than 5 but lies to its right.
		var right = new TreeNode<>(4, new TreeNode<>(3), new TreeNode<>(6));
		var root = new TreeNode<>(5, new TreeNode<>(1), right);
		assertFalse(new Problem5().isValidBst(root));
	}

	@Test
	void validBst_singleNode() {
		assertTrue(new Problem5().isValidBst(new TreeNode<>(1)));
	}
}
