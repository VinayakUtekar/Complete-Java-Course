package s5_30Apr;
//WJp to find result of number raised to power
// 2 raise to 2  = square of 2 =4
// 5 raise to 4 = 5*5*5*5 =....

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //Number
		int p = sc.nextInt(); //Power//Raise to
		int res = 1;
		for(int i=1; i<=p; i++) {
			res = res*n;
		}
		System.out.println(res);
		sc.close();
	}

}
