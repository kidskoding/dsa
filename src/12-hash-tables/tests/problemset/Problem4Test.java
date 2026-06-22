import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem4Test {

	@Test
	void containsDuplicate_hasRepeat() {
		var sut = new Problem4();
		assertTrue(sut.containsDuplicate(new int[] {1, 2, 3, 1}));
	}

	@Test
	void containsDuplicate_allDistinct() {
		var sut = new Problem4();
		assertFalse(sut.containsDuplicate(new int[] {1, 2, 3, 4}));
	}

	@Test
	void containsDuplicate_manyRepeats() {
		var sut = new Problem4();
		assertTrue(sut.containsDuplicate(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
	}
}
