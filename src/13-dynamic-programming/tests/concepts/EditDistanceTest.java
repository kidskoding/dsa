import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EditDistanceTest {

	private final EditDistance ed = new EditDistance();

	@Test
	void classicInstance() {
		assertEquals(3, ed.distance("kitten", "sitting"));
	}

	@Test
	void anotherInstance() {
		assertEquals(3, ed.distance("sunday", "saturday"));
	}

	@Test
	void identicalStrings() {
		assertEquals(0, ed.distance("same", "same"));
	}

	@Test
	void oneEmptyIsLengthOfOther() {
		assertEquals(4, ed.distance("", "abcd"));
		assertEquals(4, ed.distance("abcd", ""));
	}

	@Test
	void bothEmpty() {
		assertEquals(0, ed.distance("", ""));
	}

	@Test
	void singleSubstitution() {
		assertEquals(1, ed.distance("cat", "bat"));
	}
}
