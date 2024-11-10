package s10_13May;

//Missing element in array

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9,1,2,0,5,7,3,4,6};
		int n = a.length;
		int s =0, f=0;
		/*for(int j=0; j<=n; j++) {
			s = s+j;
		}*/
		s = (n * (n+1)) / 2;
		for(int i:a) {
			f = f + i;
		}
		System.out.println(s);
		System.out.println(f);
		System.out.println("Missing no : " + (s-f));
	}

}
