package s7_9May;

import java.util.Scanner;

//1. Decimal (base 10 number system which consist of value 0 1 2 3 4 5 6 7 8 9) it is created for human
//2. Binary - base 2 - 0 1 it is used by machine
//3. Octal - base 8 - 0 1 2 3 4 5 6 7 used by processor
//4. Hexadecimal - base 16 - 0 1 2 3 4 5 6 7 8 9 A B C D E F - alphanumeric value - created for memory address

//Convert decimal into other number system
//I/p 13
//O/p - 1101 (binary)
//0/p - octal
//o/p - hexadecimal
//empty string - binary = ""
//binary = remainder + binary
//1=1+"" 
//01=0+"1"
//101=1+"01"
//1101=1+"101"


//for widening 
//upper case int+55 (ASCII CODE A=65 )
//lower case int+87 (ASCII CODE a = 97)


public class P1 {
	public static void binary(int n) {
		String binary= "";
		while(n!=0) {
			int remainder = n%2;
			binary=remainder+binary;
			n/=2;
		}
		System.out.println(binary);
	}
//WAP to convert decimal to octal
	public static void octal(int n) {
		String octal="";
		while(n!=0) {
			int remainder = n%8;
			octal = remainder + octal;
			n/=8;
			
		}
		System.out.println(octal);
	}
//WAP to convert decimal to hexadecimal
	public static void hexadecimal(int n) {
		String hexadecimal="";
		while(n!=0) {
			int remainder = n%16;
			if (remainder== 10) {
				hexadecimal = "A"+hexadecimal;
			}
			else if (remainder== 11)
			{
				hexadecimal = "B" + hexadecimal;
			}
			else if (remainder== 12)
			{
				hexadecimal = "C" + hexadecimal;
			}
			else if (remainder== 13)
			{
				hexadecimal = "D" + hexadecimal;
			}
			else if (remainder== 14)
			{
				hexadecimal = "E" + hexadecimal;
			}
			else if (remainder== 15)
			{
				hexadecimal = "F" + hexadecimal;
			}
			else {
			hexadecimal = remainder + hexadecimal;
			}
			n/=16;
		}
		System.out.println(hexadecimal);
	}
	
//2nd method for hexadecimal
	
	
	public static void hex(int n) {
		String hexadecimal="";
		while(n!=0) {
			int remainder = n%16;
			if (remainder < 10) {
				hexadecimal = remainder + hexadecimal;
			}
			else {
				//for widening 
				//upper case int+55 (ASCII CODE A=65 )
				//lower case int+87 (ASCII CODE a = 97)
				hexadecimal = (char)(remainder+55) + hexadecimal;
			}
			n/=16;
		}
		System.out.println(hexadecimal);

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n= s.nextInt();
		binary(n);
		octal(n);
		hexadecimal(n);
		hex(n);
		s.close();
	}

}