package s8_10May;

import java.util.Scanner;

// Convert Octal to decimal

public class P4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0, p=1, base = 8;
		while(n!=0) {
			int d = n%10;		
			sum = sum + d * p;	
			p = p * base;		
			n = n/10;			
		}
		System.out.println(sum);
		sc.close();
	}

}