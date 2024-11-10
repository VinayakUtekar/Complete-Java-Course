package s8_10May;

import java.util.Scanner;

//WJP that takes the binary representation of a positive Integer and print the number of set bits
//set bits is "1"

//E1--> n = 11, output = 3
//input = 11 --> binary = 1011 --> No of 1 in binary = 3 --> Output -->3 set bits

//E2--> n = 128, output = 1
//input = 128 --> binary = 10000000 --> No of 1 in binary = 1 --> Output -->1 set bits

//E3--> n = 2147483645, output = 30
//input = 2147483645 --> binary = 1111111111111111111111111111101 --> No of 1 in binary = 30 --> Output -->30 set bits

public class P6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int countx = 0;

		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.bitCount(n)); //toOctal//toHex
		while(n!=0) {
			int remainder = n%2;
			if(remainder == 1) {
				countx ++;
			}
			n/=2;
		}
		System.out.println(countx);
		sc.close();
	}

}