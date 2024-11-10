package s14_21May;

// Sorting - Arranging elements in certain order....
// 			 1) Either from lowest to highest
//			 2) of from highest to lowest

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] a = {'v', 'i', 'n', 'a', 'y', 'a', 'k'};
		System.out.println("Befor Sorting");
		printArray(a);
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j] < a[j+1]) {
					char temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("After Sorting");
		printArray(a);
	}
	
	public static void printArray(char [] arr) {
		for(char i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

}
