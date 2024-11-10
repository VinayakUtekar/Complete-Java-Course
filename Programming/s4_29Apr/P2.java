package s4_29Apr;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int od = 0;
		int ed = 0;
		while(n!=0) 
		{
			int digi = n % 10;
			if(digi % 2 == 0) {
				ed = ed + digi;
			}
			else {
				od = od + digi;
			}
			n = n / 10;
		}
		System.out.println("Discount : " + (od*ed));
		sc.close();
	}

}
