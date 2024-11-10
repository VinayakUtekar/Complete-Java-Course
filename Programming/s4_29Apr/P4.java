package s4_29Apr;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = 0;
		while(n!=0) 
		{
			int digi = n % 10;
			int count = 2;
			for(int i=2; i<= n/2; i++) {
				if(digi % i ==0) {
					count++;
				}
			}
			if(count==2) {
				d = d + digi;
			}
			n = n / 10;
		}
		System.out.println("Discount : " + d);
		sc.close();
	}
}

