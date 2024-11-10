class ICICIBankSavingAccount 
{
	String un;
	double balance;
	static String b_name = "ICICI_BANK";

	public static void account_details(String un, double balance)
	{
		System.out.println("User--------------------------------------> ");
		System.out.println("Account Holder Name : " + un);
		System.out.println("Account Balance : " + balance);
		System.out.println("Bank Name : " + b_name);
	}

	public static void main(String[] args) 
	{
		ICICIBankSavingAccount ref1 = new ICICIBankSavingAccount();
		ref1.un = "Vinayak";
		ref1.balance = 10000.00;
		account_details(ref1.un, ref1.balance);

		ICICIBankSavingAccount ref2 = new ICICIBankSavingAccount();
		ref2.un = "Omkar";
		ref2.balance = 2000.85;
		account_details(ref2.un, ref2.balance);

		ICICIBankSavingAccount ref3 = new ICICIBankSavingAccount();
		ref3.un = "Aardhya";
		ref3.balance =  3000.20;
		account_details(ref3.un, ref3.balance);
	}
}
