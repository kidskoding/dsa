import java.util.ArrayList;
import java.util.List;

/** A node in a rooted, weighted tree used by the tree-DP routines. */
public final class TreeNode {
	/** The weight of this node. */
	public int weight;

	/** This node's children. */
	public final List<TreeNode> children = new ArrayList<>();

	/**
	 * Creates a node with the given weight.
	 *
	 * @param weight the node weight
	 */
	public TreeNode(int weight) {
		this.weight = weight;
	}

	/**
	 * Adds a child to this node and returns the child for convenient chaining.
	 *
	 * @param child the child to attach
	 * @return the attached child
	 */
	public TreeNode addChild(TreeNode child) {
		children.add(child);
		return child;
	}
}
