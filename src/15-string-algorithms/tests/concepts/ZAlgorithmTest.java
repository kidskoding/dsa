import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ZAlgorithmTest {

	@Test
	void zArray_classicString_returnsExpected() {
		var sut = new ZAlgorithm();
		// "aabxaabxcaabxaabxay" Z-array (entry 0 is 0 by convention).
		assertEquals(
				List.of(0, 1, 0, 0, 4, 1, 0, 0, 0, 8, 1, 0, 0, 5, 1, 0, 0, 1, 0),
				boxed(sut.zArray("aabxaabxcaabxaabxay")));
	}

	@Test
	void zArray_singleChar_returnsZero() {
		var sut = new ZAlgorithm();
		assertEquals(List.of(0), boxed(sut.zArray("a")));
	}

	@Test
	void search_multipleMatches_returnsAllStarts() {
		var sut = new ZAlgorithm();
		assertEquals(List.of(0, 9, 12), sut.search("ABABDABACDABABCABAB", "ABAB"));
	}

	@Test
	void search_overlappingMatches_reportsEach() {
		var sut = new ZAlgorithm();
		assertEquals(List.of(0, 1, 2, 3), sut.search("aaaaaa", "aaa"));
	}

	@Test
	void search_noMatch_returnsEmpty() {
		var sut = new ZAlgorithm();
		assertEquals(List.of(), sut.search("abcde", "xyz"));
	}

	@Test
	void search_fullMatch_returnsZero() {
		var sut = new ZAlgorithm();
		assertEquals(List.of(0), sut.search("hello", "hello"));
	}

	@Test
	void search_emptyPattern_matchesEveryPosition() {
		var sut = new ZAlgorithm();
		assertEquals(List.of(0, 1, 2), sut.search("ab", ""));
	}

	@Test
	void search_emptyText_nonEmptyPattern_returnsEmpty() {
		var sut = new ZAlgorithm();
		assertEquals(List.of(), sut.search("", "a"));
	}

	private static List<Integer> boxed(int[] values) {
		return java.util.Arrays.stream(values).boxed().toList();
	}
}
