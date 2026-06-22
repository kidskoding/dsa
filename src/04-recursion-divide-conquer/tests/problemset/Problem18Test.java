import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class Problem18Test {

	private final Problem18 sut = new Problem18();

	@Test
	void generateParenthesis_three() {
		Set<String> actual = new HashSet<>(sut.generateParenthesis(3));
		assertEquals(Set.of("((()))", "(()())", "(())()", "()(())", "()()()"), actual);
	}

	@Test
	void generateParenthesis_one() {
		assertEquals(List.of("()"), sut.generateParenthesis(1));
	}

	@Test
	void generateParenthesis_two() {
		assertEquals(Set.of("(())", "()()"), new HashSet<>(sut.generateParenthesis(2)));
	}
}
