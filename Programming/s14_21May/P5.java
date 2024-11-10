package s14_21May;

// Creatring dplicate of an array

import java.util.Scanner; 

public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i = 0; i< n; i++) {
			System.out.println("Enter the element at index " + i + " : ");
			a[i] = sc.nextInt();
		}
		
		int [] b = a.clone();
		
		sc.close();
	}
}
