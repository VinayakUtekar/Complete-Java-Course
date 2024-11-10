package s20_28May;

// WJP to check if the String is palindrome or not

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Madam";
		String rev = "";
		for (int i = s.length()-1; i >=0 ; i--) {
			rev = rev + s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
