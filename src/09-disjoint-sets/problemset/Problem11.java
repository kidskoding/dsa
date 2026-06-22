import java.util.List;

/** Tier 3 — Problem 11: Accounts merge. */
public class Problem11 {

	/**
	 * Given a list of {@code accounts} where each account is a name followed by emails, merges
	 * accounts that share any email and returns the merged groups. Each returned group is the account
	 * name followed by its emails sorted in ascending order. Use union-find keyed by email.
	 *
	 * @param accounts the input accounts, each {@code [name, email1, email2, ...]}
	 * @return the merged accounts, each {@code [name, sortedEmail1, ...]}
	 */
	public List<List<String>> accountsMerge(List<List<String>> accounts) {
		// TODO: union emails that co-occur in an account, then group emails by representative.
		throw new UnsupportedOperationException("TODO: implement accountsMerge");
	}
}
