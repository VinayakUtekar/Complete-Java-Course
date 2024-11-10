package s16_23May;

// Insertion sort  -> Shifting technique

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9,3,1,14,5};
		printArray(a);
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i;
			while(j>0 && a[j-1] > temp) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}
		System.out.println("Ascending : ");
		printArray(a);
		
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i;
			while(j>0 && a[j-1] < temp) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}
		System.out.println("Descending : ");
		printArray(a);
	}
	
	public static void printArray(int [] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

}