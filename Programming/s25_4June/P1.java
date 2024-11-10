package s25_4June;

//WJP to capatialize first alphabet of each word in the sentence

public class P1 {

	public static String captalize(String s) {
		String rev = "";
		for (int i =0 ; i< s.length(); i++) {
			if(i==0) {
				rev = rev + (char)(s.charAt(i)-32);
			}
			else {
				rev = rev + s.charAt(i);
			}
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "my name is jspider";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(captalize(a[i]) + " ");
		}
	}

}
