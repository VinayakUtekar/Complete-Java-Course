package s11_15May;

import java.util.Scanner;

// a = {8,3,15,7,2}
//WJP to find Greates Number

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		int larg = a[0];
		for(int i : a) {
			if(i > larg) {
				larg = i;
			}
		}
		System.out.println("\nLargest Element : " + larg);
		sc.close();
	}

}
