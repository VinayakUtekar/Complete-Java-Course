package s11_15May;

import java.util.Scanner;

// a = {8,3,15,7,2}
//WJP to find 3rd Smallest Number

public class P6 {

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
		
		int Small = a[0], Small2 = a[1], Small3 = 0;
		for(int i=0 ; i < n; i++) {
			if(a[i] < Small){ 
				Small3 = Small2;
				Small2 = Small;
				Small = a[i];
			}
			else if((a[i] > Small) && (a[i] < Small2)) {
				Small3 = Small2; 
				Small2 = a[i];
			}
			else if((a[i] > Small) && (a[i] > Small2) && (a[i] < Small3)) {
				Small3 = a[i];
			}
		}
		System.out.println("\nSmallest Element : " + Small);
		System.out.println("2nd Smallest Element : " + Small2);
		System.out.println("3nd Smallest Element : " + Small3);
		sc.close();
	}

}