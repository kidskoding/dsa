import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void levelOrder_emptyTree_isEmpty() {
		assertEquals(List.of(), new Problem05().levelOrder(null));
	}

	@Test
	void levelOrder_threeLevels_groupsByLevel() {
		var left = new TreeNode<>(2, new TreeNode<>(4), null);
		var root = new TreeNode<>(1, left, new TreeNode<>(3));
		assertEquals(List.of(List.of(1), List.of(2, 3), List.of(4)), new Problem05().levelOrder(root));
	}
}
