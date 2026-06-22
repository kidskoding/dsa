import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void reverseKGroup_exactGroups() {
		var r = new Problem12().reverseKGroup(Problem01Test.of(1, 2, 3, 4), 2);
		assertArrayEquals(new int[] {2, 1, 4, 3}, Problem01Test.toArray(r));
	}

	@Test
	void reverseKGroup_leftoverStaysAsIs() {
		var r = new Problem12().reverseKGroup(Problem01Test.of(1, 2, 3, 4, 5), 2);
		assertArrayEquals(new int[] {2, 1, 4, 3, 5}, Problem01Test.toArray(r));
	}

	@Test
	void reverseKGroup_kEqualsOne_unchanged() {
		var r = new Problem12().reverseKGroup(Problem01Test.of(1, 2, 3), 1);
		assertArrayEquals(new int[] {1, 2, 3}, Problem01Test.toArray(r));
	}
}
