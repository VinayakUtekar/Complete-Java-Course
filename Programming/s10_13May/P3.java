package s10_13May;

import java.util.Scanner;

//Missing element in array

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Ener Element at index " + i + " : ");
			a[i] = sc.nextInt();
		} 
		int s =0, f=0;
		/*for(int j=0; j<=n; j++) {
			s = s+j;
		}*/
		s = (n * (n+1)) / 2;
		for(int i:a) {
			f = f + i;
		}
		System.out.println(s);
		System.out.println(f);
		System.out.println("Missing no : " + (s-f));
		sc.close();
	}

}
