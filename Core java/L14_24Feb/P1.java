class  P1
{
	P1()
	{
		System.out.println("No Argument Constructor");
	}

	P1(int a)
	{
		System.out.println("Paramiterized Constructor");
		System.out.println("a : " + a);
	}

	public static void main(String[] args) 
	{
		int a = 10;

		P1 ref = new P1();
		System.out.println(ref);
	
		P1 ref2 = new P1(a);
		System.out.println(ref2);
	}
}
