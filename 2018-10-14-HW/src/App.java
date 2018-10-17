
public class App {

	public static void main(String[] args) {
		// Part 1
		StrSplitter strSplit = new StrSplitter();
		String str = "abcdefghijklmnopqrstuvwxy";
		String[] strParts = strSplit.splitInN(str, 5);
		for (int i = 0; i < strParts.length; i++) {
			System.out.println(strParts[i]);
		}
		
		System.out.println();
		
		// Part 2
		str = "the quick brown fox";
		String mask = "queen";
		IntersectingCharsRemover icr = new IntersectingCharsRemover();
		String newStr = icr.removeIntersectingChars(str, mask);
		System.out.println(newStr);
	}

}
