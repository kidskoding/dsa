import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void countNodes_emptyTree_isZero() {
		assertEquals(0, new Problem02().countNodes(null));
	}

	@Test
	void countNodes_threeNodeTree_isThree() {
		var root = new TreeNode<>(1, new TreeNode<>(2), new TreeNode<>(3));
		assertEquals(3, new Problem02().countNodes(root));
	}
}
