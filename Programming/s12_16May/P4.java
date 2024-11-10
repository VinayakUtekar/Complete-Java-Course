package s12_16May;

import java.util.Scanner;

// WJp to find the count of ele of unsorted array which equal to avg of array
// a = {2,2,2,2,2}  --> avg = 2
// a[i] = avg --> count +1
// Display number of count

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		int sum = 0 ;
		for(int i = 0; i< n; i++) {
			System.out.println("Enter the element at index " + i + " : ");
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		int avg = sum/a.length, count = 0;
		System.out.print("Array : ");
		for(int i : a) {
			System.out.print(i + " ");
			if(i == avg) {
				count++;
			}
		}
		System.out.println("\nAverage of element : " + avg);
		System.out.println("Count of element : " + count);
		sc.close();
	}

}
