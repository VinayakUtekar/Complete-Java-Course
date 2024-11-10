package food;

import java.util.Random;
import java.util.Scanner;

public class PaymentGateway implements Paymet {
	static boolean payment =false;
	@Override
	public void upiPaymet() {
		System.out.println("Choose Payment Option");
		System.out.println("1.PhonePay");
		System.out.println("2.GPay");
		System.out.println("3.Cash");
		Scanner s = new Scanner(System.in);
		int op = s.nextInt();
		switch (op) {
		case 1: {
			phonePay();
			break;
		}
		default:
			System.out.println("Enter valid option for payment");
			upiPaymet();
		}
	}

	public void phonePay() {
		Scanner s = new Scanner(System.in);
		System.out.println("Total price is " + Menu.totalPrice);
		System.out.println("Verify your registered mobile number");
		long mobilenumber = s.nextLong();
		if (mobilenumber == Menu.mno) {
			int a = 9999;
			Random r = new Random();
			int o = r.nextInt(a);
			while (o < 999) {
				o = r.nextInt(a);
			}
			System.out.println(o);
			System.out.println("enter the otp displayed on the screen");
			int otp = s.nextInt();
			if (otp == o) {
				System.out.println("Enter amount");
				double price = s.nextDouble();
				if (Menu.totalPrice >= price) {
					payment=true;
					System.out.println("Payment sucessfull");
				}
			} else {
				System.out.println("Enter valid OTP");
				int o1 = s.nextInt();
				if (o1 == o) {
					System.out.println("Enter amount");
					double price = s.nextDouble();
					if (Menu.totalPrice >= price) {
						System.out.println("Payment sucessfull");
					}
				}
			}
		} else {
			System.out.println("Enter registered Mobile number");
			// phonePay();
			upiPaymet();
		}
	}
}