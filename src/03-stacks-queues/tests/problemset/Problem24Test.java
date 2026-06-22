import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem24Test {

	@Test
	void nestedGroups() {
		assertEquals(23, Problem24.calculate("(1+(4+5+2)-3)+(6+8)"));
	}

	@Test
	void withSpaces() {
		assertEquals(3, Problem24.calculate(" 2-1 + 2 "));
	}
}
