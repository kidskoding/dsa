import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem8Test {

	private final Problem8 sut = new Problem8();

	@Test
	void equations_contradiction_false() {
		assertFalse(sut.equationsPossible(new String[] {"a==b", "b!=a"}));
	}

	@Test
	void equations_consistent_true() {
		assertTrue(sut.equationsPossible(new String[] {"b==a", "a==b"}));
	}

	@Test
	void equations_transitiveContradiction_false() {
		assertFalse(sut.equationsPossible(new String[] {"a==b", "b==c", "a!=c"}));
	}
}
