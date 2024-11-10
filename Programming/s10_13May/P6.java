package s10_13May;

import java.util.Scanner;

//AP to display all the prime number from the arry

public class P6 {

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
			int f = i;
			int count = 2;
			if(f!=0 && f!=1) {
				for(int j=2; j<= f/2; j++) {
					if(f%j == 0) {
						count ++;
					}
					
				}
				if(count == 2) {
					System.out.print(f + " ");
				}
			}
		}
		sc.close();
	}

}
