import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem24Test {

	private final Problem24 sut = new Problem24();

	@Test
	void maxReward_twoJobs() {
		assertEquals(60L, sut.maxReward(new int[] {4, 1, 1, 1}, new int[] {20, 10, 40, 30}));
	}

	@Test
	void maxReward_fiveJobs() {
		assertEquals(127L, sut.maxReward(new int[] {2, 1, 2, 1, 1}, new int[] {100, 19, 27, 25, 15}));
	}

	@Test
	void maxReward_singleSlot() {
		assertEquals(8L, sut.maxReward(new int[] {1, 1, 1}, new int[] {5, 8, 3}));
	}
}
