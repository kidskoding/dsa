import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem10Test {

	@Test
	void canConstruct_missingLetter() {
		var sut = new Problem10();
		assertFalse(sut.canConstruct("a", "b"));
	}

	@Test
	void canConstruct_notEnough() {
		var sut = new Problem10();
		assertFalse(sut.canConstruct("aa", "ab"));
	}

	@Test
	void canConstruct_enough() {
		var sut = new Problem10();
		assertTrue(sut.canConstruct("aa", "aab"));
	}
}
