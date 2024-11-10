class ICICIBankSavingAccount2
{
	String un;
	double balance;m 
	static String b_name;

	public static void account_details(String un, int balance, String b_name)
	{
		ICICIBankSavingAccount2 ref1 = new ICICIBankSavingAccount2();
		ref1.un = "Vinayak";
		ref1.balance = 10000;
		ref1.b_name = "ICICI_Bank";

		ICICIBankSavingAccount2 ref2 = new ICICIBankSavingAccount2();
		ref2.un = "Omkar";
		ref2.balance = 1000;
		ref2.b_name = "ICICI_Bank";

		ICICIBankSavingAccount2 ref3 = new ICICIBankSavingAccount2();
		ref3.un = "Aaradhya";
		ref3.balance = 100000;
		ref3.b_name = "ICICI_Bank";
		
		System.out.println("User 1 -> ");
		System.out.println("Account Holder Name : " + ref1.un);
		System.out.println("Account Balance : " + ref1.balance);
		System.out.println("Bank Name : " + ref1.b_name);

		System.out.println("\n \n User 2 -> ");
		System.out.println("Account Holder Name : " + ref2.un);
		System.out.println("Account Balance : " + ref2.balance);
		System.out.println("Bank Name : " + ref2.b_name);

		System.out.println("\n \n User 3 -> ");
		System.out.println("Account Holder Name : " + ref3.un);
		System.out.println("Account Balance : " + ref3.balance);
		System.out.println("Bank Name : " + ref3.b_name);
	}

	public static void main(String[] args) 
	{
		account_details();
	}
}
