
public class StrSplitter {

	public String[] splitInN(String str, int n) {
		
		int len = str.length();
		int partLen = len/n;

		String[] ret = new String[n];
		
		for(int i = 0; i < n; i++) {
			int j = i*n;
			char[] buff = new char[partLen];
			str.getChars(j, j+partLen, buff, 0);
			ret[i] = new String(buff);
		}
		
		return ret;
	}

}
