class BOB 
{
	static
	{
		System.out.println("Application is begin");
	}

	public static void create(String name, double balance)
	{
		System.out.println("Application created successfully");
		System.out.println("Account Holder Name : " + name);
		System.out.println("Application Balance : " + balance);
	}
	public static void main(String[] args) 
	{
		create("Vinayak",10);
	}
}
