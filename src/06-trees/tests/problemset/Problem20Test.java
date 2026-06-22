import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem20Test {

	@Test
	void rightSideView_typical() {
		var left = new TreeNode<>(2, null, new TreeNode<>(5));
		var right = new TreeNode<>(3, null, new TreeNode<>(4));
		var root = new TreeNode<>(1, left, right);
		assertEquals(List.of(1, 3, 4), new Problem20().rightSideView(root));
	}

	@Test
	void rightSideView_leftChain() {
		var root = new TreeNode<>(1, null, new TreeNode<>(3));
		assertEquals(List.of(1, 3), new Problem20().rightSideView(root));
	}

	@Test
	void rightSideView_emptyTree() {
		assertEquals(List.of(), new Problem20().rightSideView(null));
	}
}
