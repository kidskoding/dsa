import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void hasTwoSum_pairExists_returnsTrue() {
		var sut = new Problem02();
		assertTrue(sut.hasTwoSum(new int[] {2, 7, 11, 15}, 9));
	}

	@Test
	void hasTwoSum_noPair_returnsFalse() {
		var sut = new Problem02();
		assertFalse(sut.hasTwoSum(new int[] {1, 2, 3}, 100));
	}
}
