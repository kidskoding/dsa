import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem8Test {

	@Test
	void invert_swapsChildren() {
		var root = new TreeNode<>(2, new TreeNode<>(1), new TreeNode<>(3));
		var inverted = new Problem8().invert(root);
		assertEquals(2, inverted.value);
		assertEquals(3, inverted.left.value);
		assertEquals(1, inverted.right.value);
	}

	@Test
	void invert_singleNode_unchanged() {
		var inverted = new Problem8().invert(new TreeNode<>(7));
		assertEquals(7, inverted.value);
		assertNull(inverted.left);
		assertNull(inverted.right);
	}

	@Test
	void invert_emptyTree_isNull() {
		assertNull(new Problem8().invert(null));
	}
}
