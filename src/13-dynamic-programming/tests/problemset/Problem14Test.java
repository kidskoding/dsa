import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	private final Problem14 p = new Problem14();

	@Test
	void transpositionCostsOne() {
		assertEquals(1, p.damerauDistance("ab", "ba"));
	}

	@Test
	void classicInstance() {
		assertEquals(1, p.damerauDistance("ca", "ac"));
	}

	@Test
	void identicalStrings() {
		assertEquals(0, p.damerauDistance("same", "same"));
	}

	@Test
	void oneEmpty() {
		assertEquals(3, p.damerauDistance("", "abc"));
	}
}
