package s10_13May;

import java.util.Scanner;

//AP to display all the prime number from the arry

public class P5 {
	
	public static boolean isPrimeNo(int num) {
		int count = 2;
		if(num!=0 && num!=1) {
			for(int j=1; j<=num; j++) {
				if(num%j == 0) {
					count ++;
				}	
			}
		}
		return count == 2? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Ener Element at index " + i + " : ");
			a[i] = sc.nextInt();
		} 
		for(int i:a) {
			if(isPrimeNo(i)) {
				System.out.print(i);
			}
		}
		sc.close();
	}

}
