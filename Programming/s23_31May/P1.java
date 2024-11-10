package s23_31May;

// WJP to check if the string is a strong password or not

// Conditions : 
/*				1. Length of string must be atleast 8
 				2. String must contain atleast 1 UpperCase Character
 				3. String must contain atleast 1 LowerCase Character
 				4. String must contain atleast 1 Digit Character
 				5. String must contain atleast 1 Special Character
 */

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length() >= 8) {
			boolean upper=false, lower=false, digit=false, special=false;
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(ch >= 'A' && ch <= 'Z') {
					upper=true;
				}
				else if(ch >= 'a' && ch <= 'z') {
					lower=true;
				}
				else if(ch >= '0' && ch <= '9') {
					digit=true;
				}
				else {
					special=true;
				}
			}
			if(upper && lower && digit && special){
				System.out.println("Password is Strong");
			}
			else {
				System.out.println("Password is not strong");
			}
		}else {
			System.out.println("Password length must be greater then or equal to 8");
		}
		sc.close();
	}

}
