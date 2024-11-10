package s7_9May;

import java.util.Scanner;

public class P4 {
	
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
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n= s.nextInt();
		hexadecimal(n);
		hex(n);
		s.close();
	}

}
