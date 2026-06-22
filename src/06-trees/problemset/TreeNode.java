/**
 * A shared binary-tree node used across the problem set. Each problem operates on plain {@code
 * TreeNode<Integer>} structures so that the focus stays on the algorithm rather than on a
 * particular tree implementation. Defined once here and reused by every {@code ProblemNN}.
 *
 * @param <T> the value type stored at the node
 */
public final class TreeNode<T> {
	public T value;
	public TreeNode<T> left;
	public TreeNode<T> right;

	public TreeNode(T value) {
		this.value = value;
	}

	public TreeNode(T value, TreeNode<T> left, TreeNode<T> right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
}
