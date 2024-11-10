package s9_11May;

// Array --> Continuous block of memory --> Stored inside a object
// This object is called Array
// To access data we use index --> Index in java starts from 0 to n-1

// Properties ->
// Homogeneous Data / type of value only
// Always Fixed in size
// Is data not provided explicitly Array will store default value of the given datatype

// Create an array -->
// 1) Using Array Literal (If data to be stored in array is known)
//	  datatype [] variable = {v1, v2, v3, v4,............};  
//    datatype variable [] = {};

// 2) Using new keyword (When the User is going to enter the data and no of element is unknown)
//	  datatype [] variable = new datatype[size];

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {10,20,30,40};
		
		//Displays the address of array
		System.out.println(a);
		
		//Length of array
		System.out.println(a.length);
		
		//Display data at index 0,1,2,3
		System.out.print(a[0] + " ");
		System.out.print(a[1] + " ");
		System.out.print(a[2] + " ");
		System.out.println(a[3]);
		// System.out.println(a[4]); ArrayIndexOutOfBounceException
		// System.out.println(a[-1]); ArrayIndexOutOfBounceException
		
		//Using For Loop
		System.out.println("For Loop");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// Using For Each Loop
		System.out.println("For Each Loop");
		for(int n: a) {
			System.out.print(n + " ");
		}
	}

}
