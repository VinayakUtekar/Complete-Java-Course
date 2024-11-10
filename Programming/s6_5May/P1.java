package s6_5May;

// Reverse a number
// Step 1 Separate a digit
// store in other variable
// iterate to next digit
// store the digit in varbila but....
// for storing first multiply by 10 to  shift the existing number

// n = 123 --->>321 
//     12   3
// rev = 3
//     1    2
// rev = 3 * 10 + 2 = 30 + 2 = 32
//     0    1 
// rev = 32 * 10 + 1 = 320 + 1 = 321

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		while(n!=0) {
			int digi = n % 10;
			rev = rev * 10 + digi;
			n = n / 10;
		}
		System.out.println(rev);
		sc.close();
	}

}
