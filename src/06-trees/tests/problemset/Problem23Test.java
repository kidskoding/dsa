import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem23Test {

	@Test
	void buildTree_typical() {
		var root = new Problem23().buildTree(new int[] {3, 9, 20, 15, 7}, new int[] {9, 3, 15, 20, 7});
		assertEquals(3, root.value);
		assertEquals(9, root.left.value);
		assertEquals(20, root.right.value);
		assertEquals(15, root.right.left.value);
		assertEquals(7, root.right.right.value);
	}

	@Test
	void buildTree_singleNode() {
		var root = new Problem23().buildTree(new int[] {-1}, new int[] {-1});
		assertEquals(-1, root.value);
		assertNull(root.left);
		assertNull(root.right);
	}

	@Test
	void buildTree_leftChain() {
		var root = new Problem23().buildTree(new int[] {1, 2, 3}, new int[] {3, 2, 1});
		assertEquals(1, root.value);
		assertEquals(2, root.left.value);
		assertEquals(3, root.left.left.value);
	}
}
