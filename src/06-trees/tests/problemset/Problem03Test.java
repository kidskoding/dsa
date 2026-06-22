import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void isValidBst_emptyTree_isTrue() {
		assertTrue(new Problem03().isValidBst(null));
	}

	@Test
	void isValidBst_orderedTree_isTrue() {
		var root = new TreeNode<>(5, new TreeNode<>(3), new TreeNode<>(8));
		assertTrue(new Problem03().isValidBst(root));
	}

	@Test
	void isValidBst_violatingTree_isFalse() {
		var root = new TreeNode<>(5, new TreeNode<>(6), new TreeNode<>(8));
		assertFalse(new Problem03().isValidBst(root));
	}
}
