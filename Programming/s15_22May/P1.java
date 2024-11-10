package s15_22May;

// Selection sort....
// a = {9, 5, 17, 3, 1}
// 9 -> {5,17,3,1} -> select smallest element -> 1
// {1,5,17,3,9} -> swap them both

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {9,5,17,3,1};
		System.out.println("Before Sorting");
		printArray(a);
		for (int i = 0;  i< a.length; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		System.out.println("After Sorting");
		printArray(a);
	}
	
	public static void printArray(int [] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

}
