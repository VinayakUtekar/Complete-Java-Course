package s9_11May;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i = 0; i < a.length; i++) {
			System.out.println("Enter The Element At Index " + i +" : ");
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for(int j = 0; j < a.length; j++) {
			sum = sum + a[j];
		}
		System.out.println("sum : " + sum);
		sc.close();
	}

}
