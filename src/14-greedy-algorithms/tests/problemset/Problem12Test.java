import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	private final Problem12 sut = new Problem12();

	@Test
	void jump_twoJumps() {
		assertEquals(2, sut.jump(new int[] {2, 3, 1, 1, 4}));
	}

	@Test
	void jump_twoJumpsWithZero() {
		assertEquals(2, sut.jump(new int[] {2, 3, 0, 1, 4}));
	}

	@Test
	void jump_alreadyAtEnd() {
		assertEquals(0, sut.jump(new int[] {0}));
	}
}
