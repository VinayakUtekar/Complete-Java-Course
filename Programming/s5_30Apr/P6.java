package s5_30Apr;

//WJP to check if number is a strong number or not
// a strong number is a number whose
// sum of factorial of each digit = original number;
// Eg = 145
// sum of factorialof digits = 1! + 4! + 5!
// (1!+4!+5!) = 145

import java.util.Scanner;

public class P6 {
	public static int fact(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n, sum = 0;
		while(n!=0) {
			int d = n%10;
			sum = sum + fact(d);
			n=n/10;
		}
		if(sum == temp) {
			System.out.println(temp + " is  a strong number");
		}
		else {
			System.out.println("Not a strong number");
		}
		sc.close();
	}

}