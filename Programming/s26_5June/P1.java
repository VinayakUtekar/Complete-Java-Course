package s26_5June;

// WJP to Swap the strings without third variable
/*
  IndexOf(ch) -> Returns the index of character in the string
  IndecOf(ch, 2) -> Returns the index of character in the string after index 2
  Substring(i) -> returns a part of string from index i to end of string
  Substring(i,j) -> returns a part of string from index i to j index of string
*/

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Vishal";
		System.out.println("Before Swapping");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		
		s1 = s1.concat(s2);
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After Swapping");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
	}

}
