package s11_15May;

import java.util.Scanner;

// a = {8,3,15,7,2}
//WJP to find 2nd Greatest Number

public class P5 {

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
		
		int larg = a[0], larg2 = 0;
		for(int i=0 ; i < n; i++) {
			if(a[i] > larg){ 
				larg2 = larg;
				larg = a[i];
			}
			else if((a[i] != larg) && (a[i] > larg2)) {
				larg2 = a[i];
			}
		}
		System.out.println("\nLargest Element : " + larg);
		System.out.println("2nd Largest Element : " + larg2);
		sc.close();
	}

}