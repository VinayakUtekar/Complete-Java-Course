package s13_17May;

import java.util.Scanner;

// WAJP to remove the array from the given index
// a = {Zero, One, Two, Three, Four, Five}
// index = 2
// Output = {Zero, One, Three, Four, Five}

public class P1 {
	
	public static String[] RemoveEle(String[] a, int ind) {
		String [] res = new String[a.length-1];
		if(ind<0 || ind>=a.length) {
			System.out.println("Index Does NOt Exits");
		}
		else{
			for(int i = 0; i < res.length; i++) {
				if(i<ind) {
					res[i] = a[i];
				}
				else {
					res[i] = a[i+1];
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Take input
		int n = sc.nextInt();
		String [] a = new String[n];
		for(int i = 0; i< n; i++) {
			System.out.println("Enter the element at index " + i + " : ");
			a[i] = sc.next();
		}
		System.out.println("Enter the index to remove : ");
		int ind = sc.nextInt();
		
		// Display Original Array
		System.out.print("Original Array : ");
		for(String i : a) {
			System.out.print(i + " ");
		}
		
		a = RemoveEle(a,ind);
		
		// Display New Array
		System.out.print("\nNew Array : ");
		for(String i : a) {	
		System.out.print(i + " ");
		}
		sc.close();
	}

}
