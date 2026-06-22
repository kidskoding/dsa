import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem06Test {

	@Test
	void countPatternOccurrences_countsEachPattern() {
		var sut = new Problem06();
		String text = "banana";
		String[] patterns = {"ana", "na", "xyz"};
		assertArrayEquals(new int[] {2, 2, 0}, sut.countPatternOccurrences(text, patterns));
	}
}
