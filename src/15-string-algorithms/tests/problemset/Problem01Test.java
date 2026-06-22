import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void match_multipleMatches_returnsAllStarts() {
		assertEquals(List.of(0, 9, 12), new Problem01().match("ABABDABACDABABCABAB", "ABAB"));
	}

	@Test
	void match_overlappingMatches_reportsEach() {
		assertEquals(List.of(0, 1, 2, 3), new Problem01().match("aaaaaa", "aaa"));
	}

	@Test
	void match_noMatch_returnsEmpty() {
		assertEquals(List.of(), new Problem01().match("abcde", "xyz"));
	}

	@Test
	void match_emptyPattern_matchesEveryPosition() {
		assertEquals(List.of(0, 1, 2), new Problem01().match("ab", ""));
	}
}
