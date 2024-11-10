package s22_30May;

// WJP to count precentage of  uppercase letters, lowercase letter, digits and special character in string

public class P1 {

	public static void main(String[] args) {
	       String s = "Hello123@123";
	       double Uc = 0.0, Lc = 0.0, Dc = 0.0, Sc = 0.0;
	       for (int i=0; i < s.length(); i++) {
	    	   char ch = s.charAt(i);
	    	   if (ch >= 'a' && ch <='z') {
	    		   Lc++;
	    	   } else if (ch >= 'A' && ch <='Z') {
	    		   Uc++;
	    	   } else if (ch >='0' && ch <= '9') {
	    		   Dc++;
	    	   } else {
	    		   Sc++;
	    	   }
	       }
	       System.out.println("Uppercase letters : " + (Uc / s.length() * 100));
	       System.out.println("Lowercase letters : " + (Lc / s.length() * 100));
	       System.out.println("Digits : " + (Dc / s.length() * 100));
	       System.out.println("Special character : " + (Sc / s.length() * 100));
		}

}
