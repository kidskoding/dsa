import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void occursInSomeRotation_rotationContainsPattern_returnsTrue() {
		// "cdeab" is a rotation of "abcde" and contains "dea".
		assertTrue(new Problem12().occursInSomeRotation("abcde", "dea"));
	}

	@Test
	void occursInSomeRotation_wrapAround_returnsTrue() {
		assertTrue(new Problem12().occursInSomeRotation("abcde", "eab"));
	}

	@Test
	void occursInSomeRotation_absent_returnsFalse() {
		assertFalse(new Problem12().occursInSomeRotation("abcde", "xyz"));
	}
}
