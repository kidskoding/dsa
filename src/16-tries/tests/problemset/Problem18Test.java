import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem18Test {

	private final Problem18 sut = new Problem18();

	@Test
	void maxXorOfSet() {
		assertEquals("28", sut.run(new String[] {"3", "10", "5", "25", "2", "8"}));
	}

	@Test
	void allZeros() {
		assertEquals("0", sut.run(new String[] {"0", "0"}));
	}

	@Test
	void smallSet() {
		assertEquals("10", sut.run(new String[] {"8", "10", "2"}));
	}
}
