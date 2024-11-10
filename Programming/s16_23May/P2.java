package s16_23May;

import java.util.Arrays;

// Binary Search
// # conditions --> 
//					* Ascending order compulsory (to have all small values in left and higher value right side)
//					1) a[middle] == target --> Element found at this index
//					2) a[middle] > target  --> Left Side and iterate from step 1 again from middle+1
//					3) a[middle] < target  --> Right Side and iterate from step 1 again till middle-1
//	Arrays inbuilt library -->  Arrays.sort(a)   -->  System.out.println(Arrays.toString(a))

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {90, 76, 86, 62, 84};
		int targ = 62;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int start=0, end=a.length-1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(targ == a[mid]) {
				System.out.println("\nElement is present at : " + mid);
				break;
			}
			else if(targ > a[mid]) {
				start = mid + 1;
			}
			else if(targ < a[mid]) {
				end = mid-1;
			}
		}
		if(start > end) {
			System.out.println("Element is not present");
		}
	}

}
