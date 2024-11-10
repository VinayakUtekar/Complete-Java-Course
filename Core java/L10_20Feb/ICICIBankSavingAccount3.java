class ICICIBankSavingAccount3 
{
	String un;
	double balance;
	static String b_name = "ICICI_BANK";

	public static void account_details(String un, int balance)
	{
		System.out.println("User--------------------------------------> ");
		System.out.println("Account Holder Name : " + un);
		System.out.println("Account Balance : " + balance);
		System.out.println("Bank Name : " + b_name);
	}

	public static void main(String[] args) 
	{
		ICICIBankSavingAccount3 ref1 = new ICICIBankSavingAccount3();
		ref1.account_details("Vinayak", 10000.00);

		ICICIBankSavingAccount3 ref2 = new ICICIBankSavingAccount3();
		ref2.account_details("Omkar", 2000.85);

		ICICIBankSavingAccount3 ref3 = new ICICIBankSavingAccount3();
		ref3.account_details("Aardhya", 3000.20);
	}
}
