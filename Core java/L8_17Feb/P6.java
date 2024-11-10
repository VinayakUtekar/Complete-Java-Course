class P6 
{
	static char a;
	static boolean b;

	public static void Qspiders()
	{
		System.out.println("QSP Begins");
		System.out.println("a: " + a);
		System.out.println("b : " + b);
		a = 'a';
		b = true;
		Jspiders();
		System.out.println("QSP Ends");
	}

	public static void Jspiders()
	{
		System.out.println("JSP Begins");
		System.out.println("a: " + a);
		System.out.println("b : " + b);
		a = 'b';
		b = false;
		System.out.println("JSP Ends");
	}

	static
	{
		System.out.println("SIB1");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Begins");
		char a = 'a';
		Qspiders();
		System.out.println("a: " + a);
		System.out.println("a: " + P6.a);
		System.out.println("b: " + b);
		System.out.println("Main Ends");
	}

	static
	{
		System.out.println("SIB2");
		Jspiders();
	}
}
