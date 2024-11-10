package s4_29Apr;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ;
		int a = n;
		int sum = 0;
		while(n!=0) 
		{
			int digi = n % 10;
			sum = sum + digi;
			n = n / 10;
		}
		if(a%sum == 0) {
			System.out.println("is Harshad Number");
		}
		else {
			System.out.println("Not a harshad number");
		}
		sc.close();
	}

}
