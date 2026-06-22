import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class KmpTest {

	@Test
	void prefixFunction_classicPattern_returnsBorders() {
		var sut = new Kmp();
		// "ababaca" -> [0,0,1,2,3,0,1]
		assertEquals(List.of(0, 0, 1, 2, 3, 0, 1), boxed(sut.prefixFunction("ababaca")));
	}

	@Test
	void prefixFunction_singleChar_returnsZero() {
		var sut = new Kmp();
		assertEquals(List.of(0), boxed(sut.prefixFunction("a")));
	}

	@Test
	void search_multipleMatches_returnsAllStarts() {
		var sut = new Kmp();
		assertEquals(List.of(0, 9, 12), sut.search("ABABDABACDABABCABAB", "ABAB"));
	}

	@Test
	void search_overlappingMatches_reportsEach() {
		var sut = new Kmp();
		assertEquals(List.of(0, 1, 2, 3), sut.search("aaaaaa", "aaa"));
	}

	@Test
	void search_noMatch_returnsEmpty() {
		var sut = new Kmp();
		assertEquals(List.of(), sut.search("abcde", "xyz"));
	}

	@Test
	void search_fullMatch_returnsZero() {
		var sut = new Kmp();
		assertEquals(List.of(0), sut.search("hello", "hello"));
	}

	@Test
	void search_emptyPattern_matchesEveryPosition() {
		var sut = new Kmp();
		assertEquals(List.of(0, 1, 2), sut.search("ab", ""));
	}

	@Test
	void search_emptyText_nonEmptyPattern_returnsEmpty() {
		var sut = new Kmp();
		assertEquals(List.of(), sut.search("", "a"));
	}

	private static List<Integer> boxed(int[] values) {
		return java.util.Arrays.stream(values).boxed().toList();
	}
}
