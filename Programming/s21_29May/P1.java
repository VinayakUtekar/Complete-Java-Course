package s21_29May;

// WJP to convert all lowecase character into uppercase character
// using string inbuilt method

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pineapple";	
		String Output = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			Output = Output + (char)(ch-32);  // Each concatination create new object //P  //PI  //PIN  //PINA.....
		}
		System.out.println(Output);
	}

}
