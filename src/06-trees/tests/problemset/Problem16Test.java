import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem16Test {

	private TreeNode<Integer> bst() {
		var left = new TreeNode<>(2, new TreeNode<>(1), new TreeNode<>(3));
		return new TreeNode<>(4, left, new TreeNode<>(7));
	}

	@Test
	void search_found() {
		var found = new Problem16().search(bst(), 2);
		assertEquals(2, found.value);
		assertEquals(1, found.left.value);
		assertEquals(3, found.right.value);
	}

	@Test
	void search_absent_isNull() {
		assertNull(new Problem16().search(bst(), 5));
	}

	@Test
	void search_leaf() {
		assertEquals(7, new Problem16().search(bst(), 7).value);
	}
}
