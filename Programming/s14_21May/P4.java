package s14_21May;

// Magic Value of an Array
// 0 4 0 0 1 3 4 1 0 2

import java.util.Scanner; 

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i = 0; i< n; i++) {
			System.out.println("Enter the element at index " + i + " : ");
			a[i] = sc.nextInt();
		}
		int [] b = a.clone();
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		
		System.out.println(a);
		System.out.println(b);
		
		int Gv =0, Bv=0;
		for(int i=0; i<a.length; i++) {
			if(a[i] == b[i]) {
				Gv = Gv + b[i];
			}
			else if(a[i] != b[i]){
				Bv = Bv + b[i];
			}
		}
		
		int Mv = Gv - Bv;
		System.out.println("Bad Value : " + Bv);
		System.out.println("Good Value : " + Gv);
		System.out.println("Magic Value : " + Mv);
		
		sc.close();
	}
}
