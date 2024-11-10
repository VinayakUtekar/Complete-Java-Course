package s5_30Apr;
//WJP to check whether number is armstrong number or not
// n = 153
// (1^3 + 5^3 + 3^3)
// 1 + 125 + 27 = 153

// n = 370
// (3^3 + 7^3 + 0^3)
// (27 + 343 + 0) = 370


import java.util.Scanner;

public class P5 {
	public static int countDigit(int n) {
		int count = 0;
		while(n!=0) {
			count++;
			n = n/10;
		}
		return count;
	}
	
	public static int powerof(int n, int p) {
		int res = 1;
		for(int i=1; i<=p; i++) {
			res = res * n;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0, temp = n;
		int Dcount = countDigit(n);
		while(n!=0) {
			int d = n%10;
			sum = sum + powerof(d, Dcount);
			n = n/10;
		}
		if(sum == temp) {
			System.out.println(temp + " is a armstrong number");
		}
		else {
			System.out.println(temp + " is not a armstrong number");
		}
		sc.close();
	}

}
