import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SuffixTreeTest {

	@Test
	void contains_findsSubstring() {
		var sut = new SuffixTree("mississippi");
		assertTrue(sut.contains("ssi"));
		assertFalse(sut.contains("abc"));
	}

	@Test
	void countOccurrences_countsRepeats() {
		var sut = new SuffixTree("banana");
		assertEquals(2, sut.countOccurrences("ana"));
	}

	@Test
	void countOccurrences_absentPattern_isZero() {
		var sut = new SuffixTree("banana");
		assertEquals(0, sut.countOccurrences("xy"));
	}
}
