package s15_22May;

// Linear Search Algorithm (Sequential Search)
// Compare the target element to all the element in array sequentially

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {9,5,17,3,1};
		int target = 17;
		int i = 0;
		for ( ; i < a.length; i++) {
			if(target == a[i]) {
				System.out.println("Element is present at : " + i);
				break;
			}
		}
		if(i == a.length) {
			System.out.println("Element is not present");
		}
	}

}
