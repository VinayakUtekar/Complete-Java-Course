package idf;

import java.util.Scanner;

public class IDF_Driver {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.signup");
		System.out.println("2.login");
		System.out.println("3.Exist");
		
		Menu m = new Menu();
		int choice=s.nextInt();
		switch (choice) {
		case 1: {
			m.singup();
			break;
		}
		case 2:{
			m.login();
			break;
		}
		case 3:{
			System.out.println("Thank You!! Visit Again");
			System.exit(0);
		}
		default:
			System.err.println("enter valid input");
			main(null);
		}
		m.Forces();
		
	}

}