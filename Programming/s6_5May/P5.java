package s6_5May;

// Check whether Spy number
// sum of digits = product of digits

import java.util.Scanner;

public class P5 {
	public static int SumDigi(int num) {
		int val=0;
		while(num!=0) {
			int d = num%10;
			val = val + d;
			num = num/10;
		}
		return val;
	}
	
	public static int Pro(int num) {
		int val=1;
		while(num!=0) {
			int d = num%10;
			val = val * d;
			num = num/10;
		}
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(SumDigi(n) == Pro(n)) {
			System.out.println("Spy Number");
		}
		else {
			System.out.println("Not Spy Number");
		}
		sc.close();
	}

}
