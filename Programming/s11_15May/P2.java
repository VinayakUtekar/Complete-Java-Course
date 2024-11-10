package s11_15May;

import java.util.Scanner;

//WJP to find sum of all digits of the elements of the aray

public class P2 {
	public static int SumofDigi(int num) {
		int sum = 0;
		while(num != 0) {
			int d = num % 10;
			sum = sum + d;
			num = num / 10;
		}
		return sum;
	}
	
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
		
		System.out.println("\nSum Array : ");
		for(int i : a) {
			int s = SumofDigi(i);
			System.out.print(s + " ");
		}
		
		sc.close();
	}

}
