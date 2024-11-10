package s11_15May;

import java.util.Scanner;

//WJP to find sum of all digits of the elements of the aray

public class P1 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i = 0 ; i<n ; i++)
		{
			System.out.println("Enter element at index " + i + " : ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Original Array : ");
		for(int i : a) {
			System.out.print(i + " ");
		}
		
		for(int i = 0; i<n; i++) {
			int sum = 0;
			while(a[i] != 0) {
				int d = a[i] % 10;
				sum = sum + d;
				a[i] = a[i] / 10;
			}
			a[i] = sum;
		}
		
		System.out.println("\nSum Array : ");
		for(int i : a) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}

}
