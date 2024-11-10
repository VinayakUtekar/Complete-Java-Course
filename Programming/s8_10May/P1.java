package s8_10May;

import java.util.Scanner;

// Convert binary to decimal
// 1011 -> 11
// 1x2 raise to 3 + 0x2 raise to 2 + 1x2 raise to1 + 1x2 raise to 0
// 8 + 0 + 2 +1
//11

public class P1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0, p=0;
		while(n!=0) {
			int d = n%10;
			sum = sum + d * (int)Math.pow(2, p);
			p++;
			n = n/10;
		}
		System.out.println(sum);
		sc.close();
	}

}