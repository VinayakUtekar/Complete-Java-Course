package s10_13May;

import java.util.Scanner;

//WJP to print all the even elements

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int f = 0; f < a.length; f++) {
			System.out.println("Enter The Element At Index " + f +" : ");
			a[f] = sc.nextInt();
		}
		int sum = 0;
		// Using For Each Loop
		for(int f: a) {
			if(f % 2 == 0) {
				sum = sum + f;
			}
		}
		System.out.println(sum);
		sc.close();	}

}
