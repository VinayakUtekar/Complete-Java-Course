package s15_22May;

import java.util.Scanner;

// Given a  array find triplet that matches the target value
// arr[] = {0, -1, 2, -3, 1}
// o/p --> (0 -1 1), (2 -3 1)

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int  k= j+1;  k< arr.length; k++) {
					int s = arr[i] + arr[j] + arr[k];
					if(s == sum) {
						System.out.println("("+ arr[i] + " "+ arr[j] + " " + arr[k] +")");
					}
				}
			}
		}
		
		sc.close();
	}

}
