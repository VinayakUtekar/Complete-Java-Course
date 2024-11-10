package s6_5May;

// WJP to check number is palindrome
// number = reverse of number
// 

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0, temp = n;
		while(n!=0) {
			int digi = n % 10;
			rev = rev * 10 + digi;
			n = n / 10;
		}
		if(rev == temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		sc.close();
	}

}
