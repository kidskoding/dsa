import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem11Test {

	@Test
	void accountsMerge_joinsAccountsSharingEmail() {
		var sut = new Problem11();
		var accounts =
				List.of(
						List.of("John", "a@x.com", "b@x.com"),
						List.of("John", "b@x.com", "c@x.com"),
						List.of("Mary", "m@x.com"));
		var merged = sut.accountsMerge(accounts);
		assertEquals(2, merged.size());
	}
}
