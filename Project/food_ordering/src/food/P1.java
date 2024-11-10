package food;

import java.util.Random;

public class P1 {
	public static void main(String[] args) {
	//	System.out.println(Math.random());
		int i=9999;
		Random r = new Random();
		int a=r.nextInt(i);
//		System.out.println(a);
		while(a<999) {
			a=r.nextInt(i);
			//System.out.println(a);
		}
		System.out.println(a);
	}

}
