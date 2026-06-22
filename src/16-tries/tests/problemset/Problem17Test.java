import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem17Test {

	private final Problem17 sut = new Problem17();

	@Test
	void weightedPrefixSums() {
		String[] lines = {"apple 3", "app 2", "---", "ap", "app", "b"};
		assertArrayEquals(new String[] {"5", "5", "0"}, sut.run(lines));
	}

	@Test
	void reinsertOverwritesWeight() {
		String[] lines = {"apple 3", "apple 7", "---", "app"};
		assertArrayEquals(new String[] {"7"}, sut.run(lines));
	}

	@Test
	void mixedPrefixes() {
		String[] lines = {"cat 4", "car 5", "---", "ca", "cat", "cz"};
		assertArrayEquals(new String[] {"9", "4", "0"}, sut.run(lines));
	}
}
