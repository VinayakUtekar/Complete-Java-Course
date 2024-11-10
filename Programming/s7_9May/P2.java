package s7_9May;

import java.util.Scanner;

public class P2 {
	
	//WAP to convert decimal to binary
	public static void binary(int n) {
		String binary= "";
		while(n!=0) {
			int remainder = n%2;
			binary=remainder+binary;
			n/=2;
		}
		System.out.println(binary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n= s.nextInt();
		binary(n);
		s.close();
	}

}
