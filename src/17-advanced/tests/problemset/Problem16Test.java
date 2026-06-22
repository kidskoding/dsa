import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	@Test
	void longestCommonSubstring_findsSharedRun() {
		var sut = new Problem16();
		assertEquals("world", sut.longestCommonSubstring("helloworld", "aworldb"));
	}
}
