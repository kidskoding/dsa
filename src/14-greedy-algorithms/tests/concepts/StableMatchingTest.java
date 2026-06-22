import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StableMatchingTest {

	// Proposers prefer receiver 0 first; receivers prefer proposer 0 first.
	private static final int[][] PROPOSER_PREFS = {{0, 1}, {1, 0}};
	private static final int[][] RECEIVER_PREFS = {{0, 1}, {1, 0}};

	@Test
	void match_producesProposerOptimalAssignment() {
		var sut = new StableMatching();
		assertArrayEquals(new int[] {0, 1}, sut.match(PROPOSER_PREFS, RECEIVER_PREFS));
	}

	@Test
	void match_resultIsStable() {
		var sut = new StableMatching();
		int[] m = sut.match(PROPOSER_PREFS, RECEIVER_PREFS);
		assertTrue(sut.isStable(PROPOSER_PREFS, RECEIVER_PREFS, m));
	}

	@Test
	void isStable_blockingPairPresent_returnsFalse() {
		var sut = new StableMatching();
		// Swapping the optimal assignment creates a blocking pair.
		assertFalse(sut.isStable(PROPOSER_PREFS, RECEIVER_PREFS, new int[] {1, 0}));
	}

	@Test
	void isStable_optimalAssignment_returnsTrue() {
		var sut = new StableMatching();
		assertTrue(sut.isStable(PROPOSER_PREFS, RECEIVER_PREFS, new int[] {0, 1}));
	}
}
