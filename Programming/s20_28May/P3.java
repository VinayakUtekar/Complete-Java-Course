package s20_28May;


// WAJP to count all the vowels in the string

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "orange";
		int count =0 ;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
