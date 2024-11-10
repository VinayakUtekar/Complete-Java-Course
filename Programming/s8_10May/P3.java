package s8_10May;

import java.util.Scanner;

// Convert binary to decimal
// 1011 -> 11
// 1x2 raise to 3 + 0x2 raise to 2 + 1x2 raise to1 + 1x2 raise to 0
// 8 + 0 + 2 +1
//11

public class P3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0, p=1, base = 2;
		while(n!=0) {
			int d = n%10;		//1		//1		//0		//1
			sum = sum + d * p;	//0+1*1	//1+1*2	//3+0*4	//3+1*8
			p = p * base;		//1*2	//2*2	//4*2	//8*2
			n = n/10;			//101	//10	//1		//0
		}
		System.out.println(sum);
		sc.close();
	}

}