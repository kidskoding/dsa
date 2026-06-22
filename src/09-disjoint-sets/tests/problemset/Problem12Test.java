import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class Problem12Test {

	private final Problem12 sut = new Problem12();

	private static List<List<String>> normalize(List<List<String>> in) {
		List<List<String>> out = new ArrayList<>();
		for (List<String> acc : in) {
			out.add(new ArrayList<>(acc));
		}
		out.sort((a, b) -> String.join(",", a).compareTo(String.join(",", b)));
		return out;
	}

	@Test
	void accountsMerge_twoJohnsMerge() {
		List<List<String>> input = Arrays.asList(
			Arrays.asList("John", "a@x.com", "b@x.com"),
			Arrays.asList("John", "b@x.com", "c@x.com"),
			Arrays.asList("Mary", "m@x.com"));
		List<List<String>> expected = Arrays.asList(
			Arrays.asList("John", "a@x.com", "b@x.com", "c@x.com"),
			Arrays.asList("Mary", "m@x.com"));
		assertEquals(normalize(expected), normalize(sut.accountsMerge(input)));
	}

	@Test
	void accountsMerge_noSharedEmail_staysSeparate() {
		List<List<String>> input = Arrays.asList(
			Arrays.asList("Alex", "alex@x.com"),
			Arrays.asList("Alex", "alex2@x.com"));
		List<List<String>> expected = Arrays.asList(
			Arrays.asList("Alex", "alex2@x.com"),
			Arrays.asList("Alex", "alex@x.com"));
		assertEquals(normalize(expected), normalize(sut.accountsMerge(input)));
	}

	@Test
	void accountsMerge_transitiveMerge() {
		List<List<String>> input = Arrays.asList(
			Arrays.asList("Sam", "s1@x.com", "s2@x.com"),
			Arrays.asList("Sam", "s2@x.com"),
			Arrays.asList("Sam", "s1@x.com", "s3@x.com"));
		List<List<String>> expected = Collections.singletonList(
			Arrays.asList("Sam", "s1@x.com", "s2@x.com", "s3@x.com"));
		assertEquals(normalize(expected), normalize(sut.accountsMerge(input)));
	}
}
