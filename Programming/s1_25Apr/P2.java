package s1_25Apr;

import java.util.Scanner;

public class P2 {
	public static int Countd(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num = num/10;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Dcount = Countd(n);
		if(Dcount % 2 ==0) {
			int Fhalf = n, Shalf = 0, i=1, temp=0;
			while(i<=Dcount/2) {
				int d = Fhalf % 10;
				temp = temp*10 + d;
				Fhalf = Fhalf/10;
				i++;
			}
			while(temp!=0) {
				int f = temp%10;
				Shalf = Shalf*10 + f;
				temp = temp/10;
			}
			int sum = Fhalf + Shalf;
			int squ = sum * sum;
			if(squ == n) {
				System.out.println(n + " Is A Tech Number");
			}
			else {
				System.out.println(n + " Is Not A Tech Number");
			}
		}	
		else {
			System.out.println(n + " Is Not A Tech Number");
		}
		sc.close();
	}
}