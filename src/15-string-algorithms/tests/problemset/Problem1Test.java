import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem1Test {

	private final Problem1 sut = new Problem1();

	@Test
	void match_multipleMatches() {
		assertEquals(List.of(0, 9, 12), sut.match("ABABDABACDABABCABAB", "ABAB"));
	}

	@Test
	void match_overlapping() {
		assertEquals(List.of(0, 1, 2, 3), sut.match("aaaaaa", "aaa"));
	}

	@Test
	void match_noMatch() {
		assertEquals(List.of(), sut.match("abcde", "xyz"));
	}

	@Test
	void match_emptyPattern() {
		assertEquals(List.of(0, 1, 2), sut.match("ab", ""));
	}
}
