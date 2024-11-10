package s11_15May;

import java.util.Scanner;

//WJP to print binary representation of each element of the aray by taking the input from the user

public class P3 {
	
	public static void bin(int num) {
		int n = num;
		String binary= "";
		while(num!=0) {
			int remainder = num % 2;
			binary=remainder+binary;
			num /=2;
		}
		System.out.println(n + " " + binary);
	}
	
	public static void main(String [] args) {
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
		
		System.out.println("\n Binary Representation Array : ");
		for(int i : a) {
			bin(i);
		}
		
		sc.close();
	}
}