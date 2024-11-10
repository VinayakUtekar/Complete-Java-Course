package s17_24May;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of outer array: ");
		int outer = s.nextInt();
		System.out.println("Enter the size of inner array: ");
		int inner = s.nextInt();
		
		int[][] a = new int[outer][inner];
		
		for(int i =0; i<outer;i++) {
			for(int j = 0 ; j<inner ; j++) {
				System.out.println("Enter element at "  + i + " " + j );
				a[i][j] = s.nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		s.close();
	}

}
