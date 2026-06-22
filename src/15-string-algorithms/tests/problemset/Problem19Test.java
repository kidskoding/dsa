import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem19Test {

	private final Problem19 sut = new Problem19();

	@Test
	void rotation_found() {
		assertTrue(sut.occursInRotation("abcde", "deab"));
	}

	@Test
	void rotation_notFound() {
		assertFalse(sut.occursInRotation("abcde", "fgh"));
	}

	@Test
	void rotation_full() {
		assertTrue(sut.occursInRotation("aaaa", "aaaa"));
	}
}
