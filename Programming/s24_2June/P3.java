package s24_2June;

/* If any Q related to words divide string into word
   WJP to reverse the String
   My Name is vinayak
   vinayak is name My
*/

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "my name is vinayak";
		String[] a = s.split(" ");
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		String se = "my.name,is+vinayak";
		String[] ae = se.split("[.,+]");
		for (int i = ae.length-1; i >= 0; i--) {
			System.out.print(ae[i] + " ");
		}
	}

}
