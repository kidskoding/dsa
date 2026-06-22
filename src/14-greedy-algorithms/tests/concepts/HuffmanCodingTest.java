import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;
import org.junit.jupiter.api.Test;

class HuffmanCodingTest {

	@Test
	void buildTree_rootFrequencyEqualsTotal() {
		var sut = new HuffmanCoding();
		HuffmanNode root = sut.buildTree(Map.of('a', 5L, 'b', 9L, 'c', 12L));
		assertEquals(26L, root.frequency);
	}

	@Test
	void buildCodes_arePrefixFree() {
		var sut = new HuffmanCoding();
		Map<Character, String> codes = sut.buildCodes(Map.of('a', 5L, 'b', 9L, 'c', 12L, 'd', 13L));
		for (var x : codes.values()) {
			for (var y : codes.values()) {
				if (x != y) {
					assertTrue(!x.startsWith(y) || x.equals(y), x + " is a prefix of " + y);
				}
			}
		}
	}

	@Test
	void buildCodes_singleSymbol_assignsZero() {
		var sut = new HuffmanCoding();
		assertEquals(Map.of('a', "0"), sut.buildCodes(Map.of('a', 42L)));
	}

	@Test
	void encodedBitLength_classicInstance_matchesOptimum() {
		var sut = new HuffmanCoding();
		// Frequencies a:5 b:9 c:12 d:13 e:16 f:45 — CLRS optimal cost is 224 bits.
		Map<Character, Long> f = Map.of('a', 5L, 'b', 9L, 'c', 12L, 'd', 13L, 'e', 16L, 'f', 45L);
		assertEquals(224L, sut.encodedBitLength(f));
	}
}
