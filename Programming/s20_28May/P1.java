package s20_28May;

// WJP to print the reverse of the String

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Orange";
		String rev = "";
		for (int i = s.length(); i >=0 ; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

}
