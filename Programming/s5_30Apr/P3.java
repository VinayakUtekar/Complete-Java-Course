package s5_30Apr;

//WJP to count the number of digits in the input
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		while(n!=0) {
			count++;
			n = n/10;
		}
		System.out.println("No of Digits : " + count);
		sc.close();

	}

}
