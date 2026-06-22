import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem17Test {

	@Test
	void achievableSequence() {
		assertTrue(
				Problem17.validateStackSequences(
						new int[] {1, 2, 3, 4, 5}, new int[] {4, 5, 3, 2, 1}));
	}

	@Test
	void impossibleSequence() {
		assertFalse(
				Problem17.validateStackSequences(
						new int[] {1, 2, 3, 4, 5}, new int[] {4, 3, 5, 1, 2}));
	}
}
