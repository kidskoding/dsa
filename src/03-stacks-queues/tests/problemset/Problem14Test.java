import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void collapsesSlashes() {
		assertEquals("/home/foo", Problem14.simplifyPath("/home//foo/"));
	}

	@Test
	void resolvesParents() {
		assertEquals("/c", Problem14.simplifyPath("/a/./b/../../c/"));
		assertEquals("/", Problem14.simplifyPath("/../"));
	}
}
