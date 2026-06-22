import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem3Test {

	private final Problem3 sut = new Problem3();

	@Test
	void reverse_word() {
		assertEquals("noisrucer", sut.reverse("recursion"));
	}

	@Test
	void reverse_empty() {
		assertEquals("", sut.reverse(""));
	}

	@Test
	void reverse_singleChar() {
		assertEquals("a", sut.reverse("a"));
	}
}
