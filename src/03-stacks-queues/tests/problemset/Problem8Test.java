import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem8Test {

	@Test
	void equalAfterBackspaces() {
		assertTrue(Problem8.backspaceCompare("ab#c", "ad#c"));
		assertTrue(Problem8.backspaceCompare("a##c", "#a#c"));
	}

	@Test
	void notEqual() {
		assertFalse(Problem8.backspaceCompare("a#c", "b"));
	}
}
