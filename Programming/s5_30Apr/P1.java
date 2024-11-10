package s5_30Apr;

//Special Number
//n = 49
// n = (sum of digits) + (product of digits)
// 49 = (4+9) + (4*9)
// 49 = 13 + 36
// 49 = 49

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n, sum=0, pro=1;
		while(n!=0) {
			int d = n%10;
			sum = sum + d;
			pro = pro * d;
			n=n/10;
		}
		int val = sum + pro;
		if(val == temp) {
			System.out.println(temp + " is Special Number");
		}
		else {
			System.out.println(temp + " is not a Special Number");
		}
		sc.close();
	}

}
