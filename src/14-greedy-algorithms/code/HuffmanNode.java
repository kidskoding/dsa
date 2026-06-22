/**
 * A node in the Huffman tree. Leaves carry a {@code symbol}; internal nodes carry {@code null} as
 * their symbol and reference two children. The {@code frequency} is the sum of the leaf
 * frequencies in the subtree and orders the merge priority queue.
 */
public final class HuffmanNode {
	/** The encoded symbol for a leaf, or {@code null} for an internal node. */
	public final Character symbol;

	/** The total frequency of all leaves in this subtree. */
	public final long frequency;

	/** The left child (conventionally the {@code 0} edge), or {@code null} for a leaf. */
	public final HuffmanNode left;

	/** The right child (conventionally the {@code 1} edge), or {@code null} for a leaf. */
	public final HuffmanNode right;

	/** Creates a leaf node for {@code symbol} with the given {@code frequency}. */
	public HuffmanNode(char symbol, long frequency) {
		this.symbol = symbol;
		this.frequency = frequency;
		this.left = null;
		this.right = null;
	}

	/** Creates an internal node merging {@code left} and {@code right}. */
	public HuffmanNode(HuffmanNode left, HuffmanNode right) {
		this.symbol = null;
		this.frequency = left.frequency + right.frequency;
		this.left = left;
		this.right = right;
	}

	/** Returns whether this node is a leaf (carries a symbol). */
	public boolean isLeaf() {
		return left == null && right == null;
	}
}
