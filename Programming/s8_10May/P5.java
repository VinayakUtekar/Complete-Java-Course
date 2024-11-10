package s8_10May;

import java.util.Scanner;

//WJP that takes the binary representation of a positive Integer and print the number of set bits
//set bits is "1"

//E1--> n = 11, output = 3
//input = 11 --> binary = 1011 --> No of 1 in binary = 3 --> Output -->3 set bits

//E2--> n = 128, output = 1
//input = 128 --> binary = 10000000 --> No of 1 in binary = 1 --> Output -->1 set bits

public class P5 {
	
	public static String bin(int n) {
		String binary= "";
		while(n!=0) {
			int remainder = n%2;
			binary=remainder+binary;
			n/=2;
		}
		return binary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int count =0;
		String num = bin(n);
		for(int i=0; i<=num.length()-1; i++) {
			if(num.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}