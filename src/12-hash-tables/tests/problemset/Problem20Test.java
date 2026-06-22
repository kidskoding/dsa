import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem20Test {

	@Test
	void largestTeam_three() {
		var sut = new Problem20();
		assertEquals(3, sut.largestTeam(new String[] {"abc", "CAB", "bca1", "xyz"}));
	}

	@Test
	void largestTeam_two() {
		var sut = new Problem20();
		assertEquals(2, sut.largestTeam(new String[] {"a1", "A2", "b"}));
	}

	@Test
	void largestTeam_empty() {
		var sut = new Problem20();
		assertEquals(0, sut.largestTeam(new String[] {}));
	}
}
