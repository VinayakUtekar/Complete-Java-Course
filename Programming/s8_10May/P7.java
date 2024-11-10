package s8_10May;

import java.util.Scanner;

public class P7 {
	public static int Deci(int n) {
		int sum=0, p=1, base = 2;
		while(n!=0) {
			int d = n%10;		
			sum = sum + d * p;	
			p = p * base;		
			n = n/10;			
		}
		return sum;
	}
	
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
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int deci = Deci(num);
		System.out.println(deci);
		octal(deci);
		sc.close();
	}

}
