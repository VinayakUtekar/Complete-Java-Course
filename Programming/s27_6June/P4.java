package s27_6June;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"apple", "watermelon", "kiwi", "banana"};
		String small = a[0];
		
		for (int i = 0; i < a.length; i++) {
				if(a[i].length() < small.length()) {
					small = a[i];
				}
		}
		System.out.println(small);
	}

}
