package s24_2June;

import java.util.Arrays;

// String created using same characteristics
// WJP to check for anagram

/* Take two string convert to array then sort and match of same data
   S1= cat	-> c1[] = [C,A,T]	-> [A,C,T]	->match
   S2= act	-> c2[] = [A,C,T]	-> [A,C,T]	->match
 */

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "act";
		String s2 = "cat";
		if(s1.length() == s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean isAnagram = true;
			for (int i = 0; i < c2.length; i++) {
				if(c1[i] != c2[i]) {
					isAnagram = false;
					break;
				}
			}
			if(isAnagram) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}
		else {
			System.out.println("Not Anagram");
		}

	}

}
