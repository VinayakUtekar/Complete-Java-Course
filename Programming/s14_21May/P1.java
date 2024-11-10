package s14_21May;

// Sorting - Arranging elements in certain order....
// 			 1) Either from lowest to highest
//			 2) of from highest to lowest

// Bubble sort
// compare the Current Element and Immediate Next element
// if CE is > IN then swap their positions and itterate again for next element
// if CE is < IN jump to next number and itterate

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {14, 3, 8, 28, 26, 2};
		System.out.println("Befor Sorting");
		printArray(a);
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("After Sorting");
		printArray(a);
	}
	
	public static void printArray(int [] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("");
	}

}
