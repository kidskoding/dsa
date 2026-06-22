import java.util.List;

/** Problem 12: Accounts Merge. */
public class Problem12 {

	/**
	 * Given a list of {@code accounts} where each account is a name followed by emails, merges
	 * accounts that share any email. Returns the merged accounts: each is the name followed by all
	 * its emails in sorted order. Accounts may be returned in any order. Key a union-find on emails,
	 * then group emails by representative.
	 *
	 * @param accounts the accounts, each a name followed by emails
	 * @return the merged accounts
	 */
	List<List<String>> accountsMerge(List<List<String>> accounts) {
		// TODO: union accounts that share an email, then collect and sort emails per representative.
		throw new UnsupportedOperationException("TODO: implement accountsMerge");
	}
}
