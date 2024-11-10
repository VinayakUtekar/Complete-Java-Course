package s9_11May;

//WJP to print all the odd elements

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5,6,7,8,9};
		
		//Using For Loop
		System.out.println("For Loop");
		for(int i = 0; i<a.length; i++) {
			if(a[i] % 2 == 1) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
		
		// Using For Each Loop
		System.out.println("For Each Loop");
		for(int n: a) {
			if(n % 2 == 1) {
				System.out.print(n + " ");
			}
		}
	}

}
