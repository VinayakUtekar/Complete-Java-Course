package s18_25May;

// Transpoce of a matrix

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] a = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0; i<a.length; i++) {     // i defines row
			for (int j = 0; j < a[i].length; j++) {   //j defines column
				System.out.print(a[j][i] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");System.out.println("");
		
		//Method 2  edit.....
		for(int i=0; i<a.length; i++) {     // i defines row
			for (int j = 0; j < a[i].length; j++) {   //j defines column
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = a[j][i];
			}
		}
		for(int i=0; i<a.length; i++) {     // i defines row
			for (int j = 0; j < a[i].length; j++) {   //j defines column
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}