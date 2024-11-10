package idf;
import java.util.Scanner;

public class Indian_AirForce {

	{
		System.out.println("Welcome to INA: ");
	}

	public void menu() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Department");
		System.out.println("01.Armoured Corps");
		System.out.println("02.Regiment of Artillery");
		System.out.println("03.Corps of Amrmy Air Defence");
		System.out.println("04.Army Aviation Corp");
		System.out.println("05.Corps od Engineer");
		System.out.println("06.Corps of Signals");
		System.out.println("07.Mechanised Infantry");
		System.out.println("08.Infantry");
		System.out.println("09.Army Service Corp");
		System.out.println("10.Army Medical Corp");
		System.out.println("11.Army Dental Corp");
		System.out.println("12.Ordinance Corp");
		System.out.println("13.Corps of Electronics & Mechanical Engineering");
		System.out.println("14.Remount & Vatering Corp");
		System.out.println("15.Corp of Military Police");
		System.out.println("16.Army Education Corp");
		System.out.println("17.Pioneer Corp");
		System.out.println("18.Army Postal Service Corp");
		System.out.println("19.Territorial Corp");
		System.out.println("20.Defence Security Corp");
		System.out.println("21.Intelligence Corp");
		System.out.println("22.Judge's Advocate General's Dept");
		System.out.println("23.Military Nursing Service");
		System.out.println("24.Human Right Cell");
		System.out.println("25.Go Back");
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

		}
		case 6: {
			
		}
		case 7: {
			// mainCourse()
			// break;
		}
		case 8: {
			// drinks()
			// break;
		}
		case 9: {
			// desert()
			// break;
		}
		case 10: {
			
		}
		case 11: {
			
		}
		case 12: {
			// mainCourse()
			// break;
		}
		case 13: {
			// drinks()
			// break;
		}
		case 14: {
			// desert()
			// break;
		}
		case 15: {
			
		}
		case 16: {
			
		}
		case 17: {
			// mainCourse()
			// break;
		}
		case 18: {
			// drinks()
			// break;
		}
		case 19: {
			// desert()
			// break;
		}
		case 20: {
			
		}
		case 21: {
			
		}
		case 22: {
			// mainCourse()
			// break;
		}
		case 23: {
			// drinks()
			// break;
		}
		case 24: {
			// desert()
			// break;
		}
		case 25: {
			Menu m = new Menu();
			m.Forces();
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
							Payment p = new PaymentGateway();//UP-CASTING
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
						Payment p = new PaymentGateway();
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
