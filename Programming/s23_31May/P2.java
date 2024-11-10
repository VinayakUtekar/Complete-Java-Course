package s23_31May;

// AlphaNumberic input.....
// Output - no of letter + String of letter + sum of digits
// Use ASCII value to get the sum


public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MU1M2B3A4I";
		String res = "";
		int sum =0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
				res = res + ch;
			}
			else if(ch>='0' && ch<='9') {
				sum = sum + (ch - '0');
			}
		}
		System.out.print(res.length());
		System.out.print(res);
		System.out.println(sum);
	}

}
