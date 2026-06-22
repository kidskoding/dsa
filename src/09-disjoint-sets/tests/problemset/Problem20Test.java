import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem20Test {

	private final Problem20 sut = new Problem20();

	@Test
	void region_largestB() {
		assertEquals(5, sut.largestRegion(new String[] {"AAB", "ABB", "BBB"}));
	}

	@Test
	void region_checkerboard() {
		assertEquals(1, sut.largestRegion(new String[] {"AB", "BA"}));
	}

	@Test
	void region_singleRow() {
		assertEquals(4, sut.largestRegion(new String[] {"CCCC"}));
	}
}
