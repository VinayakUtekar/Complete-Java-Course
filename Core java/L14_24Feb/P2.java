class  P2
{
	P2()
	{
		System.out.println("No Argument Constructor");
	}

	P2(int a)
	{
		System.out.println("1 Paramiterized Constructor");
		System.out.println("a : " + a);
	}

	P2(int a, int b)
	{
		System.out.println("2 Paramiterized Constructor");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

	P2(int a, int b, int c)
	{
		System.out.println("3 Paramiterized Constructor");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
	}

	P2(int a, int b, int c, int d)
	{
		System.out.println("4 Paramiterized Constructor");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
	}

	public static void main(String[] args) 
	{
		P2 ref = new P2(10,20,30);
		P2 ref2 = new P2();
		P2 ref3 = new P2(10,20,30,40);
		P2 ref4 = new P2(10,20);
		P2 ref5 = new P2(10);
	}
}
