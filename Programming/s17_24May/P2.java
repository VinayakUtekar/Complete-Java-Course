package s17_24May;

public class P2 {

	public static void main(String[] args) {
		int[][] a = {{1,3,5,7},{0,2,4,6},{2,3,5,7,11}};
		
		for(int i = 0 ; i<a.length;i++) {
			int sum = 0;
			for(int j = 0 ; j<a[i].length ; j++) {
				sum += a[i][j];
			}
			System.out.print(sum + " ");
		}
	}

}
