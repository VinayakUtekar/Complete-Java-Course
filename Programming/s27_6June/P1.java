package s27_6June;

public class P1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "SOSSPSSQSSRS";
		String se = "";
		int len = s.length()/3;	
		for (int i = 0; i <=len; i++) {
			se = se + "SOS";
		}
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(se.charAt(i) != s.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
