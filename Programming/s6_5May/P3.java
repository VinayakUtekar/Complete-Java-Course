package s6_5May;

// WJP to check number is neon number
// number where sum of digits of the square of number is equal to og number
// n = 9
// n square = 81
// sum of digits of square = 8 + 1 = 9
// n = 9 neon number

import java.util.Scanner;

public class P3 {
	public static int Squ(int n) {
		int val = n * n;
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0,num = Squ(n);
		while(num!=0) {
			int digit = num%10;
			sum = sum + digit;
			num = num/10;
		}
		if(sum == n) {
			System.out.println("Neon");
		}
		else{
			System.out.println("Not Neon");
		}
		sc.close();
	}

}
