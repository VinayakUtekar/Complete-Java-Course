package s12_16May;

import java.util.Scanner;

// WJP to find sum of elements of an array
// A = {14,12,0,3,5}
// Avg = sum/n

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i = 0; i< n; i++) {
			System.out.println("Enter the element at index " + i + " : ");
			a[i] = sc.nextInt();
		}
		float sum = 0.0f ;
		for(int i : a) {
			sum = sum + i;
			System.out.print(i + " ");
		}
		float avg = sum/a.length;
		System.out.print("\nAverage of array : " + avg);
		sc.close();
	}

}
