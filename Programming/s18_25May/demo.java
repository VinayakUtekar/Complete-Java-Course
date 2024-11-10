package s18_25May;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i == j) {
					sum = sum + a[i][j];
				}
				else if(i+j == a.length-1) {
					sum = sum + a[i][j];
				}
			}
		}
		System.out.println("Sum : " + sum);
	}
}