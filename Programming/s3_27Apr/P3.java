package s3_27Apr;

//GCD
//Largest or Highest divisor of two number
//12 & 18
//12 -> 1,2,3,4,6,12
//18 -> 1,2,3,6,9,18

public class P3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12, b = 48, gcd =1;
		for(int i=1; i<=a; i++) {
			if(a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
}