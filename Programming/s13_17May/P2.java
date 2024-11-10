package s13_17May;

import java.util.Scanner;

// TwoSum
// WJP to find pair of elements that match the sum given


public class P2 {
	public static void TwoSum(int [] a, int tar) {
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1 ; j< a.length; j++) {
				if(tar == (a[i] + a[j])) {
					System.out.println("[" + i + "," + j + "]");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i = 0; i< n; i++) {
			System.out.println("Enter the element at index " + i + " : ");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the sum : ");
		int sum = sc.nextInt();
		
		
		// Display Original Array
		System.out.println("Original Array : ");
		for(int i : a) {	
		System.out.print(i + " ");
		}
		System.out.println("Sum : " + sum);
		
		TwoSum(a, sum);
		
		sc.close();
	}
}
