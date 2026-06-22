import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem20Test {

	private final Problem20 sut = new Problem20();

	@Test
	void rotations_periodic() {
		assertEquals(3, sut.countRotations("ababab", "ab"));
	}

	@Test
	void rotations_single() {
		assertEquals(1, sut.countRotations("abcde", "cd"));
	}

	@Test
	void rotations_prefixTooLong() {
		assertEquals(0, sut.countRotations("abc", "abcd"));
	}
}
