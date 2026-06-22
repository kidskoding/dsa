import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void buildTree_emptyInput_returnsNull() {
		assertNull(new Problem12().buildTree(new int[] {}, new int[] {}));
	}

	@Test
	void buildTree_reconstructsRootAndChildren() {
		// Tree: 1 with left 2 and right 3.
		int[] preorder = {1, 2, 3};
		int[] inorder = {2, 1, 3};
		var root = new Problem12().buildTree(preorder, inorder);
		assertEquals(1, root.value);
		assertEquals(2, root.left.value);
		assertEquals(3, root.right.value);
	}
}
