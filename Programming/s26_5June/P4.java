package s26_5June;

public class P4 {
	public static int MissCount(String S, int se) {
	    int count = 0;
	    
	    if (S.length() % se != 0) {
	      return -1; 
	    }

	    for (int i = 0; i < S.length(); i += se) {
	      String subString = S.substring(i, i + se);
	      if (!subString.equals("SOS")) {
	        count++; 
	      }
	    }

	    return count;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "SOSTOTSQSSRS";
		String se = "SOS";
		int len = se.length();	
		System.out.println(MissCount(s,len));
	}

}
