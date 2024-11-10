package Food;

import java.util.Scanner;

public class FoodDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter your Choice:");
		System.out.println("1.Create Account");
		System.out.println("2.Login");
		System.out.println("3.Guess Account");
		System.out.println("4.Exit");
		
		int choice = s.nextInt();
		
		Menu m = new Menu();
		
		switch (choice) {
		case 1: {
			m.signup();
			break;
		}
		case 2:{
			//Login
		}
		default:
			System.out.println("You have entered: "+ choice);
			System.err.println("Please enter the valid choice");
			main(null);
		}
		
		
		

	}

}