package food;

import java.util.Scanner;

public class Alka_Bar extends Menu {

	{
		System.out.println("Happy Hours 7-9PM");
	}

	public void menu() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.Starter");
		System.out.println("2.Main Course");
		System.out.println("3.Drinks");
		System.out.println("4.Desert");
		System.out.println("5.Go Back");
		int choice = s.nextInt();
		switch (choice) {
		case 1: {
			starter();
			break;
		}
		case 2: {
			// mainCourse()
			// break;
		}
		case 3: {
			// drinks()
			// break;
		}
		case 4: {
			// desert()
			// break;
		}
		case 5: {
			Menu m = new Menu();
			m.resturant();
			break;
		}
		default:
			System.err.println("Invalid choice");
			menu();
		}
	}

	public void starter() {
		System.out.println("enter your choice");
		System.out.println("1. VEG-STARTER");
		System.out.println("2. NON-VEG STARTER");
		Scanner s = new Scanner(System.in);
		int opt = s.nextInt();

		if (opt == 1) {
			System.out.println("Select choice");
			System.out.println("1.Paneer Chilli");
			System.out.println("2.Veg Crispy");
			System.out.println("3.previous menu");
			int a = s.nextInt();
			if (a == 1) {
				System.out.println("price of panner chilli is RS.240");
				System.out.println("press 1. to confirm order");
				System.out.println("press any other number to go back");
				int order = s.nextInt();
				Menu m = new Menu();
				if (order == 1) {
					if (Menu.mno != 0) {
						System.out.println("odered placed");
						Menu.totalPrice = Menu.totalPrice + 240;
						System.out.println("Press 1 to order drom same menu");
						System.out.println("press 2 to order from another menu");
						System.out.println("press 3 to proced for bill");
						int b = s.nextInt();
						if (b == 1) {
							starter();
						} else if (b == 2) {
							menu();
						} else if (b == 3) {
							// code...Payment
							System.out.println("Total price is " + Menu.totalPrice);
							Paymet p = new PaymentGateway();//UP-CASTING
							p.upiPaymet();
							if(PaymentGateway.payment==true) {
							System.out.println("!!!Thank you!!!");
							}else {
								System.out.println("Payment fail!!! Re-Try for Payment");
								p.upiPaymet();
							}
						} else {
							System.err.println("choose valid option");
							starter();

						}

					}else {
						m.login();
						starter();
					}
					}
					else {
						starter();
					}

//				} else {
//					m.login();
//				}
			} else if (a == 2) {
				// code veg crispy
				System.out.println("price of veg crispy is Rs.180");
				System.out.println("to confirm order press 1");
				System.out.println("press any other number to go back");
				int c = s.nextInt();
				if (c == 1) {
					System.out.println("order placed");
					Menu.totalPrice = Menu.totalPrice + 180;
					System.out.println("Press 1 to order drom same menu");
					System.out.println("press 2 to order from another menu");
					System.out.println("press 3 to proced for bill");
					int d = s.nextInt();
					if (d == 1) {
						starter();
					} else if (d == 2) {
						menu();
					} else if (d == 3) {
						System.out.println("Total price is " + Menu.totalPrice);
						// payemt logic
						Paymet p = new PaymentGateway();
						p.upiPaymet();
						System.out.println("!!!Thank you!!!");
					} else {
						System.out.println("invalid option");
						starter();
					}

				}
			}

		}

		else if (opt == 2) {

		} else if (opt == 3) {
			menu();
		} else {
			System.err.println("Invalid choice");
			starter();
		}

	}

}
