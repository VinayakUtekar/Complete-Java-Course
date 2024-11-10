package s21_29May;

// WJP to convert uppercase character to lowercase and lowercase to upper

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();	
		char[] ch = s.toCharArray();  //Creates array of elements of the string
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				ch[i] = (char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z') {
					ch[i] = (char)(ch[i]+32);
			}
		}
		String res = new String(ch);
		System.out.println(res);
		sc.close();
	}

}
