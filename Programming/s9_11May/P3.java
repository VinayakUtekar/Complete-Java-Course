package s9_11May;

//Array size -5 --> Runtime error --> Syntax correct (No Compile Time error)--> But size cannot be negative --> NegativeArraySizeException
//Array size  0 --> No CompileTime/RunTime Error -> Error while accessing element

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int f = 0; f < a.length; f++) {
			System.out.println("Enter The Element At Index " + f +" : ");
			a[f] = sc.nextInt();
		}
		
		for(int f = 0; f < a.length; f++) {
			System.out.print(a[f] +" ");
		}
		sc.close();
	}

}
