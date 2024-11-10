package s12_16May;

import java.util.Scanner;

// WJP to find all the leader in the array
// Current Element is greater then all other elements further it
// a = {8,7,4,3,5,2} 
// 8 > {7,4,3,5,2} 		--> True
// 7 > {4,3,5,2}		--> True
// 4 > {3,5,2}			--> False
// 3 > {5,2}			--> False
// 5 > {2}				--> True
// 2 > {}				--> True

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i = 0; i< n; i++) {
			System.out.println("Enter the element at index " + i + " : ");
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n; i++) {
			int count = 0;
			for(int j = i+1; j < n; j++) {
				if(a[i] < a[j]) {
					count++;
					break;
				}
			}
			if(count==0){
				System.out.print(a[i] + " ");
			}
		}
		sc.close();
	}

}
