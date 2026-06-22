import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class Problem11Test {

	private final Problem11 sut = new Problem11();

	private static List<String> sorted(List<String> in) {
		List<String> out = new ArrayList<>(in);
		Collections.sort(out);
		return out;
	}

	@Test
	void dna_twoRepeats() {
		assertEquals(
				List.of("AAAAACCCCC", "CCCCCAAAAA"),
				sorted(sut.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")));
	}

	@Test
	void dna_singleRepeat() {
		assertEquals(List.of("AAAAAAAAAA"), sut.findRepeatedDnaSequences("AAAAAAAAAAAAA"));
	}

	@Test
	void dna_tooShort() {
		assertEquals(List.of(), sut.findRepeatedDnaSequences("ACGT"));
	}
}
