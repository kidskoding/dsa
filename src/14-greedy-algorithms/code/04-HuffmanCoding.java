import java.util.Map;

/**
 * Huffman coding: builds an optimal prefix-free binary code by repeatedly merging the two
 * least-frequent subtrees. See the workbook page {@code huffman-coding.md}.
 */
class HuffmanCoding {

	/**
	 * Builds a Huffman tree from a map of symbol frequencies and returns its root. With a single
	 * distinct symbol the tree is a lone leaf.
	 *
	 * @param frequencies the per-symbol frequencies (all positive); must be non-empty
	 * @return the root of the constructed Huffman tree
	 */
	public HuffmanNode buildTree(Map<Character, Long> frequencies) {
		// TODO: seed a min-priority-queue with leaves, then repeatedly merge the two smallest.
		throw new UnsupportedOperationException("TODO: implement buildTree");
	}

	/**
	 * Returns the prefix-free codeword for each symbol, derived by walking the Huffman tree (left
	 * edge appends {@code '0'}, right edge appends {@code '1'}). For a single-symbol alphabet the
	 * codeword is {@code "0"}.
	 *
	 * @param frequencies the per-symbol frequencies; must be non-empty
	 * @return a map from each symbol to its binary codeword string
	 */
	public Map<Character, String> buildCodes(Map<Character, Long> frequencies) {
		// TODO: build the tree, then DFS accumulating the bit path to each leaf.
		throw new UnsupportedOperationException("TODO: implement buildCodes");
	}

	/**
	 * Returns the total number of bits needed to encode the source with its optimal Huffman code: the
	 * sum over symbols of {@code frequency * codewordLength}. For a single-symbol alphabet each
	 * occurrence costs one bit.
	 *
	 * @param frequencies the per-symbol frequencies; must be non-empty
	 * @return the optimal encoded length in bits
	 */
	public long encodedBitLength(Map<Character, Long> frequencies) {
		// TODO: weight each symbol's depth in the tree by its frequency and sum.
		throw new UnsupportedOperationException("TODO: implement encodedBitLength");
	}
}
