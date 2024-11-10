package s10_13May;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int f = 0; f < n; f++) {
			System.out.println("Enter The Element At Index " + f +" : ");
			a[f] = sc.nextInt();
		}
		
		System.out.println("Inserted Array : ");
		for(int i : a) {
			System.out.print(i + " ");
		}
		
		for(int i = 0; i < a.length; i++) {
			int t = 0;
			while(a[i] != 0) {
				int d = a[i] % 10;
				t = t *10 + d;
				a[i] = a[i] / 10;
			}
			a[i] = t;
		}

		System.out.println("Reverse Array : ");
		for(int i : a) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}

}
