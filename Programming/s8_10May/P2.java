package s8_10May;

import java.util.Scanner;

// Convert binary to decimal
// 1011 -> 11
// 1x2 raise to 3 + 0x2 raise to 2 + 1x2 raise to1 + 1x2 raise to 0
// 8 + 0 + 2 +1
//11

public class P2 {
	
	public static int pow(int n, int p) {
		int res = 1;
		for(int i = 1 ; i<=p ; i++) {
			res = res * n;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0, p=0;
		while(n!=0) {
			int d = n%10;
			sum = sum + d * pow(2, p);
			p++;
			n = n/10;
		}
		System.out.println(sum);
		sc.close();
	}

}