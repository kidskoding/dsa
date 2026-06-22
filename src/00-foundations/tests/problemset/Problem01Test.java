import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void countOperations_smallN_matchesClosedForm() {
		var sut = new Problem01();
		assertEquals(10L, sut.countOperations(4));
	}
}
