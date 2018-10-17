
public class IntersectingCharsRemover {
	
	public String removeIntersectingChars(String str, String mask) {
		int maskLength = mask.length();
		//int strLen = str.length();

		//char[] maskChars = new char[maskLength];
		//mask.getChars(0, maskLength, maskChars, 0);
		
		for (int i = 0; i < maskLength; i++) {
			str = str.replaceAll(""+mask.charAt(i), "");
		}
		return str;
	}

}
