package s17_24May;

// Types of Array
// Single Dimensional Array --> {10,20,30,40} --> 1-Dimensional Array
// Multidimensional Array --> (Array of Arrays) --if multiple arrays store in one array. 
// 			{0,2,4,6} 		1D		,		{1,3,5,7} 			2D  , 		{2,3,5,7} 		  3D  -->MA 
// {1st array store at index zero 	, 2nd array store at index 1  ,  3rd array store at index 2}  -->2-Dimensional Array
// How to create 2-D array?
// Two syntax
// 1) using array literals
//            data_type[][] variable = {{v1,v2,v3.....},{v1,v2,v3.....},.....};     {{1st row of array},{2nd row of array}, {3rd row of array},...}
// 2) using new keyword
//            data_type[][] variable = new data_type[outer_size][inner_size];    ->[Dimension of array][dimension of row]

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,3,5,7},{0,2,4,6},{2,3,5,7,11}};
		System.out.println(a); //address of 2-d array
		System.out.println(a[0]);//address of 1-d array inside 2-d array
		System.out.println(a[0][2]);// element in 0 index array 2 index
		
		System.out.println();
		//to print
		for(int i = 0 ; i<a.length; i++) {
			for(int j = 0 ; j< a[i].length;j++) //a[i] because 2nd loop to iterate till length of 1-d array not till length of 2-d array
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
