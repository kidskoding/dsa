import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem6Test {

	@Test
	void levelOrder_threeLevels() {
		var right = new TreeNode<>(20, new TreeNode<>(15), new TreeNode<>(7));
		var root = new TreeNode<>(3, new TreeNode<>(9), right);
		assertEquals(List.of(List.of(3), List.of(9, 20), List.of(15, 7)),
				new Problem6().levelOrder(root));
	}

	@Test
	void levelOrder_singleNode() {
		assertEquals(List.of(List.of(1)), new Problem6().levelOrder(new TreeNode<>(1)));
	}

	@Test
	void levelOrder_emptyTree_isEmpty() {
		assertEquals(List.of(), new Problem6().levelOrder(null));
	}
}
