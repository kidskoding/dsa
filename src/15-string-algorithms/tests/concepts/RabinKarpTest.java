import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class RabinKarpTest {

	@Test
	void hash_isDeterministicAndInRange() {
		var sut = new RabinKarp();
		long h = sut.hash("abc", RabinKarp.DEFAULT_BASE, RabinKarp.DEFAULT_MODULUS);
		assertEquals(h, sut.hash("abc", RabinKarp.DEFAULT_BASE, RabinKarp.DEFAULT_MODULUS));
	}

	@Test
	void hash_emptyString_isZero() {
		var sut = new RabinKarp();
		assertEquals(0L, sut.hash("", RabinKarp.DEFAULT_BASE, RabinKarp.DEFAULT_MODULUS));
	}

	@Test
	void search_multipleMatches_returnsAllStarts() {
		var sut = new RabinKarp();
		assertEquals(List.of(0, 9, 12), sut.search("ABABDABACDABABCABAB", "ABAB"));
	}

	@Test
	void search_overlappingMatches_reportsEach() {
		var sut = new RabinKarp();
		assertEquals(List.of(0, 1, 2, 3), sut.search("aaaaaa", "aaa"));
	}

	@Test
	void search_noMatch_returnsEmpty() {
		var sut = new RabinKarp();
		assertEquals(List.of(), sut.search("abcde", "xyz"));
	}

	@Test
	void search_fullMatch_returnsZero() {
		var sut = new RabinKarp();
		assertEquals(List.of(0), sut.search("hello", "hello"));
	}

	@Test
	void search_emptyPattern_matchesEveryPosition() {
		var sut = new RabinKarp();
		assertEquals(List.of(0, 1, 2), sut.search("ab", ""));
	}

	@Test
	void search_emptyText_nonEmptyPattern_returnsEmpty() {
		var sut = new RabinKarp();
		assertEquals(List.of(), sut.search("", "a"));
	}
}
