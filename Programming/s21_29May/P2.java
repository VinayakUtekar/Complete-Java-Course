package s21_29May;

// WJP to convert all lowecase character into uppercase character
// using string inbuilt method

// We use array to avoid new new object creation at every concatination
// we use String constructor Convert Array to String

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pineapple";	
		char[] ch = s.toCharArray();  //Creates array of elements of the string
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				ch[i] = (char)(ch[i]-32);
			}
		}
		String res = new String(ch);
		System.out.println(res);
	}

}
