import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem9Test {

	@Test
	void sameTree_identical() {
		var p = new TreeNode<>(1, new TreeNode<>(2), new TreeNode<>(3));
		var q = new TreeNode<>(1, new TreeNode<>(2), new TreeNode<>(3));
		assertTrue(new Problem9().isSameTree(p, q));
	}

	@Test
	void sameTree_differentShape() {
		var p = new TreeNode<>(1, new TreeNode<>(2), null);
		var q = new TreeNode<>(1, null, new TreeNode<>(2));
		assertFalse(new Problem9().isSameTree(p, q));
	}

	@Test
	void sameTree_bothEmpty() {
		assertTrue(new Problem9().isSameTree(null, null));
	}
}
