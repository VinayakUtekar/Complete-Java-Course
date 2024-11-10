package s24_2June;

/*
 	//every word should be reversed at same position
 */

public class P4 {
	public static String reverse(String s) {
		String rev = "";
		for (int i = s.length()-1; i >= 0; i--) {
			rev =  rev + s.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "my name is vinayak";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(reverse(a[i]) + " ");
		}
	}

}
