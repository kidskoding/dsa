import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	private final Problem16 sut = new Problem16();

	@Test
	void sharedTwoLetterPrefix() {
		assertEquals("al", sut.run(new String[] {"alpha", "alpine", "altitude"}));
	}

	@Test
	void shortestSignCapsPrefix() {
		assertEquals("north", sut.run(new String[] {"north", "northwest", "northeast"}));
	}

	@Test
	void noSharedPrefix() {
		assertEquals("", sut.run(new String[] {"echo", "foxtrot"}));
	}
}
