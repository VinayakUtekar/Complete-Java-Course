package s4_29Apr;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = 0;
		while(n!=0) 
		{
			int digi = n % 10;
			if(digi == 2 || digi == 3 || digi == 5 || digi ==7) {
				d = d + digi;
			}
			n = n / 10;
		}
		System.out.println("Discount : " + d);
		sc.close();
	}

}