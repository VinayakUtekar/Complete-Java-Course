package s25_4June;

// WJP to convert Integer to Roman

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 40;
		String s = "";
		
		int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

	    for (int i = 0; i < values.length; i++) {
	      while (num >= values[i]) {
	        s = s + symbols[i];
	        num -= values[i];
	      }
	    }
		
	    System.out.println(s);
	
	}
}
