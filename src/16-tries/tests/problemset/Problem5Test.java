import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem5Test {

	private final Problem5 sut = new Problem5();

	@Test
	void sharedPrefix() {
		assertEquals("fl", sut.run(new String[] {"flower", "flow", "flight"}));
	}

	@Test
	void noCommonPrefix() {
		assertEquals("", sut.run(new String[] {"dog", "racecar", "car"}));
	}

	@Test
	void longerSharedPrefix() {
		assertEquals("inters", sut.run(new String[] {"interspecies", "interstellar", "interstate"}));
	}
}
