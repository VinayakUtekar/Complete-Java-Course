package s17_24May;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("outer size");
		int o = s.nextInt();
		System.out.println("Inner size");
		int in = s.nextInt();
		
		int[][] a = new int[o][in];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("enter element "+ i +" " + j);
				a[i][j] = s.nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			int largest = a[i][0];
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j] > largest) {
					largest = a[i][j];
				}
			}
			System.out.println(largest);
		}
		s.close();
	}

}