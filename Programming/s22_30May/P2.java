package s22_30May;

import java.util.Set;
import java.util.TreeSet;

// WJP to check String is panagram or not...
// Panagram - String that contains atleast once each english alphabets

// Use TreeSet to keep track of the alphabets
// TreeSet only takes Unique value 
// No Repetation and only one null value

public class P2 {

	public static void main(String[] args) {
	      String s = "thequickbrownfoxjumpsoverthelazydog";
	      s = s.toLowerCase();
	      Set<Character> set = new TreeSet<>();
	      
	      for (int i=0; i < s.length(); i++) {
	    	  char ch = s.charAt(i);
	    	  if (ch >= 'a' && ch <='z') {
	    		  set.add(ch);
	    	  }
	      } if (set.size() == 26) {
	    	  System.out.println(true);
	      } else {
		  System.out.println(false); 
	      }

		}

}
