package s7_9May;

import java.util.Scanner;

public class P3 {
	
	//WAP to convert decimal to octal
	public static void octal(int n) {
		String octal="";
		while(n!=0) {
			int remainder = n%8;
			octal = remainder + octal;
			n/=8;
			
		}
		System.out.println(octal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n= s.nextInt();
		octal(n);
		s.close();
	}

}
