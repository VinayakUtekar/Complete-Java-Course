package s6_5May;

// Check whether Happy number
// sum of digits of square of digits of number = 1
// number = sum of sqare of digits = number

// n = 28
// 28 = 2 square + 8 square = 4 + 64 = 68 not equal to 1
// therefore now....n = 68
// 68 = 6 square + 8 square = 36 + 64 = 100 not equal to 1
// now n = 100...
// 100 = 1 square + 0 square + 0 square = 1 ..... Happy number

import java.util.Scanner;

public class P4 {
	public static int sumofSquare(int num) {
		int sum = 0;
		while(num!=0) {
			int digi = num % 10;
			sum = sum + digi * digi;
			num = num / 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n!=1 && n!=4) {
			n = sumofSquare(n);
		}
		if(n == 1) {
			System.out.println("Happy Number");
		}
		else {
			System.out.println("Not a Happy Number");
		}
		sc.close();
	}

}
