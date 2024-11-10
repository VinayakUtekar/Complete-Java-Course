package s3_27Apr;
import java.util.Scanner;
//LCM
//a & b will be factors of the LCM Number
//LCM = a*b / GCD(a,b)

public class P4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int lcm=0, gcd =1;
		for(int i=1; i<=a; i++) {
			if(a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		lcm = a*b/gcd;
		System.out.println("LCM: " + lcm);
		sc.close();
	}
}